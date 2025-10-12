package com.example.todo.domain.post.domain

import java.time.Instant
import java.util.*

class PostRootAggregate (
    public val id : UUID,
    public val title: String,
    public val content: String,
    public val createdAt : Instant
)
