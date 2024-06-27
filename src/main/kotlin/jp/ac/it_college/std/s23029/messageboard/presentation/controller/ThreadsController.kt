package jp.ac.it_college.std.s23029.messageboard.presentation.controller

import jp.ac.it_college.std.s23029.messageboard.application.service.ThreadsService
import jp.ac.it_college.std.s23029.messageboard.presentation.form.GetThreadListResponse
import jp.ac.it_college.std.s23029.messageboard.presentation.form.ThreadsInfo
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/threads")
@CrossOrigin
class ThreadsController (
    private val threadsService: ThreadsService,
) {
    @GetMapping("/list")
    fun getList(): GetThreadListResponse {
        val threadsList = threadsService.getList().map(::ThreadsInfo)
        return GetThreadListResponse(threadsList)
    }
}