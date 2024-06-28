package jp.ac.it_college.std.s23029.messageboard.infrastructure.database.repository

import jp.ac.it_college.std.s23029.messageboard.domain.model.Threads
import jp.ac.it_college.std.s23029.messageboard.domain.model.ThreadsWithUser
import jp.ac.it_college.std.s23029.messageboard.domain.repository.ThreadsRepository
import jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao.ThreadsEntity
import jp.ac.it_college.std.s23029.messageboard.infrastructure.database.dao.UsersEntity
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class ThreadsRepositoryImpl : ThreadsRepository{
    /*override fun findAllWithUser(): List<ThreadsWithUser> {
        return transaction {
            ThreadsEntity.all().map { threadsEntity ->
                val userEntity = UsersEntity.findById(threadsEntity.userId.id)
                    ?: throw IllegalArgumentException("User not found with id: ${threadsEntity.userId.id}")
                ThreadsWithUser(
                    threads = threadsEntity.toThread(),
                    //user = userEntity.toUser()
                )
            }
        }
    }*/

    override fun createThread(thread: Threads): Threads {
        return transaction {
            val newthread = ThreadsEntity.new {
                title = thread.title
                userId = UsersEntity[thread.userId]
                createdAt = thread.createdAt
                updatedAt = thread.updatedAt
                deleted = thread.deleted
            }
            newthread.toThread()
        }
    }

    override fun getThreadById(id: Long): Threads? {
        return transaction {
            val threads = ThreadsEntity.findById(id)
            threads?.toThread()
        }
    }

    override fun updateThread(thread: Threads): Threads {
        return transaction {
            val threadsEntity = ThreadsEntity.findById(thread.id)
                ?: throw IllegalArgumentException("Threads not found with id: ${thread.id}")

            threadsEntity.apply{
                title = thread.title
                userId = UsersEntity[thread.userId]
                createdAt = thread.createdAt
                updatedAt = thread.updatedAt
                deleted = thread.deleted
            }
            threadsEntity.toThread()
        }
    }

    override fun deleteThread(id: Long) {
        transaction {
            ThreadsEntity.findById(id)?.deleted
        }
    }
}