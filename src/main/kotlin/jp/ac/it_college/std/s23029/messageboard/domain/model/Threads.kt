package jp.ac.it_college.std.s23029.messageboard.domain.model

import jp.ac.it_college.std.s23029.messageboard.presentation.form.UserInfo
import kotlinx.datetime.LocalDateTime

data class Threads(
    val id: Long,
    val title: String,
    val userId: Long,
    val createdBy: UserInfo,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deleted: Boolean
)
