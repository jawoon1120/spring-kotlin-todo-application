package com.example.todo.domain.post.infrastructure.repository

import com.example.todo.domain.post.application.PostRepository
import com.example.todo.domain.post.domain.PostRootAggregate
import com.example.todo.domain.post.infrastructure.converter.PostDataMapper
import com.example.todo.domain.post.infrastructure.entity.PostEntity
import org.springframework.stereotype.Repository

@Repository
class PostRepositoryImpl (
    private val postJpaRepository: PostJpaRepository,
    private val postDataMapper : PostDataMapper
): PostRepository {

    override fun findAll(): List<PostRootAggregate> {
        val postEntities : List<PostEntity> = this.postJpaRepository.findAll()
        return postEntities.map{this.postDataMapper.toAggregate(it)}
    }

}