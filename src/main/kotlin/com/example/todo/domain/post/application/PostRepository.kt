package com.example.todo.domain.post.application

import com.example.todo.domain.post.domain.PostRootAggregate

interface PostRepository {
    fun createPost(post: PostRootAggregate) : PostRootAggregate
    fun findAll(): List<PostRootAggregate>
}