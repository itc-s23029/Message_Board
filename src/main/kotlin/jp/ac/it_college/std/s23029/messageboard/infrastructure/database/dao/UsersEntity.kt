package jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class UsersEntity(id: EntityID<Long>) :LongEntity(id) {
    companion object : LongEntityClass<UsersEntity>(UsersTable)

    var viewName by UsersTable.view_name
    var email by UsersTable.email
    var password by UsersTable.password
    }