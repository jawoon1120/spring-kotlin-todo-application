package com.example.todo.domain.post.domain

import java.time.Instant
import java.util.*

class PostRootAggregate private constructor(
    public val id : UUID,
    public val title: String,
    public val content: String,
    public val createdAt : Instant,
){
    companion object {
        fun create (title: String, content: String): PostRootAggregate {
            return PostRootAggregate(
                 UUID.randomUUID(), title, content, Instant.now())
        }
        fun restore(id: UUID, title: String, content: String, createdAt: Instant): PostRootAggregate {
            return PostRootAggregate(
                id = id,
                title = title,
                content = content,
                createdAt = createdAt
            )
        }
    }
}
