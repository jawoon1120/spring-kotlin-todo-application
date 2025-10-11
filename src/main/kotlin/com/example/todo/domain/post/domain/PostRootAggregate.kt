package com.example.todo.domain.post.domain

import java.util.*

class PostRootAggregate {
    public val id : UUID
    public val title: String
    public val createdAt : Date

    constructor(id: UUID, title: String, createdDate: Date) {
        this.id = id
        this.title = title
        this.createdAt = createdDate
    }
}

