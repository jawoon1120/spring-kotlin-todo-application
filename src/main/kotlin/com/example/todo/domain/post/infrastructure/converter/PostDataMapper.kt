package com.example.todo.domain.post.infrastructure.converter

import com.example.todo.domain.post.domain.PostRootAggregate
import com.example.todo.domain.post.infrastructure.entity.PostEntity
import org.springframework.stereotype.Component
import java.time.ZoneId


@Component
class PostDataMapper {
    fun toAggregate(postEntity: PostEntity): PostRootAggregate =
        PostRootAggregate(
            id = postEntity.id!!,
            title = postEntity.title,
            content = postEntity.content,
            createdAt = postEntity.createdAt!!.atZone(ZoneId.systemDefault()).toInstant()
        )

    fun toEntity(postAggregate: PostRootAggregate): PostEntity =
        PostEntity(
            id = postAggregate.id,
            title = postAggregate.title,
            content = postAggregate.content,
            createdAt = postAggregate.createdAt.atZone(ZoneId.systemDefault()).toLocalDateTime()
        )

}