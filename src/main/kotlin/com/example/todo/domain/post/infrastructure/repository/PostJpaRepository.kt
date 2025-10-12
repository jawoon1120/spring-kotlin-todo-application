package com.example.todo.domain.post.infrastructure.repository

import com.example.todo.domain.post.infrastructure.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostJpaRepository : JpaRepository<PostEntity, Long>