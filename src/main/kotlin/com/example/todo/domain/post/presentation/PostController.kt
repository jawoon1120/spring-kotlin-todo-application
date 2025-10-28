package com.example.todo.domain.post.presentation

import com.example.todo.domain.post.application.PostService
import com.example.todo.domain.post.domain.PostRootAggregate
import com.example.todo.domain.post.presentation.dto.CreatePostRequsetDto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/posts")
class PostController(private val postService: PostService) {
    @GetMapping
    fun getAllPosts(): List<PostRootAggregate> {
        return this.postService.getAllPosts()
    }

    @PostMapping
    fun addPost(@RequestBody post: CreatePostRequsetDto): PostRootAggregate{
        return this.postService.addPost(post.title, post.content)
    }
}