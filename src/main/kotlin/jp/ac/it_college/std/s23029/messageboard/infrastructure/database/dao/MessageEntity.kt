package jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class MessageEntity(id: EntityID<Long>) : LongEntity(id){
    companion object : LongEntityClass<MessageEntity>(MessageTable)

    var threadId by MessageTable.threadId
    var userId by MessageTable.userId
    var message by MessageTable.message
    var postedAt by MessageTable.postedAt
    var updatedAt by MessageTable.updatedAt
    var deleted by MessageTable.deleted
}