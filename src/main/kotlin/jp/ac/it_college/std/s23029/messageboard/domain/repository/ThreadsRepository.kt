package jp.ac.it_college.std.s23029.messageboard.domain.repository

import jp.ac.it_college.std.s23029.messageboard.domain.model.Threads


interface ThreadsRepository {
    fun createThread(thread: Threads): Threads

    fun getThreadById(id: Long): Threads?

    fun updateThread(thread: Threads): Threads

    fun deleteThread(id: Long)
}