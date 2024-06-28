package jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao

import jp.ac.it_college.std.s23029.messageboard.domain.types.RoleType
import org.jetbrains.exposed.dao.id.LongIdTable

object UsersTable : LongIdTable("users"){
    val view_name = varchar("view_name", 32)
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
}