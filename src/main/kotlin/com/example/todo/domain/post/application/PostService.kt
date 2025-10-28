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

    fun addPost(title : String, content : String): PostRootAggregate {

        val post = PostRootAggregate.create(title, content )
        return this.postRepository.addPost(post)
    }

}