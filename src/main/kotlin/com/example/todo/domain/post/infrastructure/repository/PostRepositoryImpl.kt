package com.example.todo.domain.post.infrastructure.repository

import com.example.todo.domain.post.application.PostRepository
import com.example.todo.domain.post.domain.PostRootAggregate
import com.example.todo.domain.post.infrastructure.converter.PostDataMapper
import com.example.todo.domain.post.infrastructure.entity.PostEntity
import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.stereotype.Repository

@Repository
class PostRepositoryImpl (
    private val postJpaRepository: PostJpaRepository,
    private val entityManager: EntityManager,

    private val postDataMapper : PostDataMapper
): PostRepository {

    override fun findAll(): List<PostRootAggregate> {
        val postEntities : List<PostEntity> = this.postJpaRepository.findAll()
        return postEntities.map{this.postDataMapper.toAggregate(it)}
    }

    @Transactional
    override fun addPost(post: PostRootAggregate): PostRootAggregate {
        print("IN REPOSITORY IMPL1")
        val postEntity = this.postDataMapper.toEntity(post, true)
        print("IN REPOSITORY IMPL2")
        print(postEntity)
        val savedPostEntity = this.postJpaRepository.save(postEntity)
        print("IN REPOSITORY IMPL3")
        val postAggregate = this.postDataMapper.toAggregate(savedPostEntity)

        print("IN REPOSITORY IMPL4")

        return postAggregate
    }

}