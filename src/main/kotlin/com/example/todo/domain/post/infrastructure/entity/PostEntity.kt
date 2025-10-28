package com.example.todo.domain.post.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.domain.Persistable
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "post")
@EntityListeners(AuditingEntityListener::class)
class PostEntity  (
    @Id
    @Column(columnDefinition = "UUID")
    private val id: UUID,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var content: String,

    @CreatedDate
    @Column(updatable = false, nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    @Column
    var updatedAt: LocalDateTime? = null,

    @Column
    var deletedAt: LocalDateTime? = null,

    @Transient
    private var _isNew: Boolean = true
): Persistable<UUID>{
    override fun getId(): UUID = id

    override fun isNew(): Boolean = _isNew

    fun markNotNew() {
        _isNew = false
    }
}
