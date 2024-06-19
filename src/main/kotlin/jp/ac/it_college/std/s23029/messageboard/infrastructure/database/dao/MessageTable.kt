package jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

object MessageTable : LongIdTable("massage"){
    val threadId = reference("thread_id", ThreadsTable)
    val userId = reference("user_id", UsersTable)
    val message = text("message")
    val postedAt = datetime("posted_at")
    val updatedAt = datetime("updated_at")
    val deleted = bool("deleted").default(false)
}