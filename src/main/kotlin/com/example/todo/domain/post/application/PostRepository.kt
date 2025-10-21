package com.example.todo.domain.post.application

import com.example.todo.domain.post.domain.PostRootAggregate


interface PostRepository {
    fun findAll(): List<PostRootAggregate>
    fun addPost(post: PostRootAggregate): PostRootAggregate
}