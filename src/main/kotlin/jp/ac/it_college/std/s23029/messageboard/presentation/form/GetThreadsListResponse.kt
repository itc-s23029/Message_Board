package jp.ac.it_college.std.s23029.messageboard.presentation.form

import kotlinx.datetime.LocalDateTime
import jp.ac.it_college.std.s23029.messageboard.domain.model.Threads
import jp.ac.it_college.std.s23029.messageboard.domain.model.ThreadsWithUser
import kotlinx.serialization.Serializable

@Serializable
data class GetThreadListResponse(val threads: List<ThreadsInfo>)

@Serializable
data class ThreadsInfo(
    val id: Long,
    val title: String,
    val createBy: UserInfo,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val isDeleted: Boolean
) {
/*    constructor(model: ThreadsWithUser) : this (
        model.threads.id,
        model.threads.title,
        model.threads.createdBy,
        model.threads.createdAt,
        model.threads.updatedAt,
        model.threads.deleted,
    )*/
}

@Serializable
data class UserInfo(
    val id: Long,
    val viewName: String
)
