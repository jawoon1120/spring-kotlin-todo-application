package com.example.todo.domain.post.presentation

import com.example.todo.domain.post.application.PostService
import com.example.todo.domain.post.domain.PostRootAggregate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts")
class PostController(private val postService: PostService) {
    @GetMapping
    fun getAllPosts(): List<PostRootAggregate> {
        return this.postService.getAllPosts()
    }
}