package jp.ac.it_college.std.s23029.messageboard.presentation.form

import kotlinx.datetime.LocalDateTime
import jp.ac.it_college.std.s23029.messageboard.domain.model.Threads

data class GetThreadListResponse(
    val threads: List<ThreadsInfo>
)

data class ThreadsInfo(
    val id: Long,
    val title: String,
    val createBy: UserInfo,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val isDeleted: Boolean
) {
    constructor(thread: Threads) : this(
        thread.id,
        thread.title,
        UserInfo(thread.createdBy.id, thread.createdBy.viewName),
        thread.createdAt,
        thread.updatedAt,
        thread.deleted
    )
}

data class UserInfo(
    val id: Long,
    val viewName: String
)
