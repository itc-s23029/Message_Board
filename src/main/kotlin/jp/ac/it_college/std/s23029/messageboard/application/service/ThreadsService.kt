package jp.ac.it_college.std.s23029.messageboard.application.service

import jp.ac.it_college.std.s23029.messageboard.domain.model.Threads
import jp.ac.it_college.std.s23029.messageboard.domain.repository.ThreadsRepository
import org.springframework.stereotype.Service

@Service
class ThreadsService (
    private val threadsRepository: ThreadsRepository
) {
    fun createThread(thread: Threads): Threads {
        return threadsRepository.createThread(thread)
    }
}