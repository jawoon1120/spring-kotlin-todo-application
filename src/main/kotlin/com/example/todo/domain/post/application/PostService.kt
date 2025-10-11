package com.example.todo.domain.post.application

import com.example.todo.domain.post.domain.PostRootAggregate
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
) {
    fun getAllPosts(): List<PostRootAggregate> {
        return this.postRepository.findAll()
    }

}