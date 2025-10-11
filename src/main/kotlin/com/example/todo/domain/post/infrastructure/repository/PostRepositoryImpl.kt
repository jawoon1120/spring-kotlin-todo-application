package com.example.todo.domain.post.infrastructure.repository

import com.example.todo.domain.post.application.PostRepository
import com.example.todo.domain.post.domain.PostRootAggregate
import org.springframework.stereotype.Repository

@Repository
class PostRepositoryImpl : PostRepository {
    override fun createPost(post: PostRootAggregate): PostRootAggregate {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<PostRootAggregate> {
        TODO("Not yet implemented")
    }

}