package com.example.todo.domain.post.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@Table(name = "post")
@EntityListeners(AuditingEntityListener::class)
class PostEntity (
    @Id
    @Column(nullable = false, unique = true)
    var id : Long,

    @Column
    var title: String,

    @Column
    var content: String,

    @CreatedDate
    @Column(updatable = false, nullable = false)
    var createdAt: LocalDateTime? = null,

    @LastModifiedDate
    @Column(nullable = false)
    var updatedAt: LocalDateTime? = null,

    @Column
    var deletedAt: LocalDateTime? = null
)

