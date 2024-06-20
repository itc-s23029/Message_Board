package jp.ac.it_college.std.s23029.messageboard.domain.repository

import jp.ac.it_college.std.s23029.messageboard.domain.model.Messages

interface MessageRepository {
    fun createMessage(message: Messages): Messages

    fun getMessageId(id: Long): Messages?

    fun getMessageByThreadId(threadId: Long): List<Messages>

    fun updateMessage(message: Messages): Messages

    fun deleteMessage(id: Long)
}