package com.example.todo.domain.post.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "post")
@EntityListeners(AuditingEntityListener::class)
class PostEntity (
    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID", updatable = false, nullable = false)
    val id: UUID? = null,

    @Column
    var title: String,

    @Column
    var content: String,

    @CreatedDate
    @Column(updatable = false, nullable = false)
    var createdAt: LocalDateTime,

    @LastModifiedDate
    @Column(nullable = false)
    var updatedAt: LocalDateTime? = null,

    @Column
    var deletedAt: LocalDateTime? = null
)

