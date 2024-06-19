package jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable

object UsersTable : LongIdTable("users"){
    val view_name = varchar("view_name", 32)
    val email = varchar("email", 256)
    val password = varchar("password", 128)
}