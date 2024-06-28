package jp.ac.it_college.std.s23029.messageboard.presentation.controller

import jp.ac.it_college.std.s23029.messageboard.application.service.ThreadsService
import jp.ac.it_college.std.s23029.messageboard.application.service.security.MessageBoardUserDetails
import jp.ac.it_college.std.s23029.messageboard.presentation.form.GetThreadListResponse
import jp.ac.it_college.std.s23029.messageboard.presentation.form.ThreadsInfo
import org.springframework.boot.autoconfigure.web.ServerProperties.Jetty.Threads
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/*
@RestController
@RequestMapping("/threads")
@CrossOrigin
class ThreadsController(
    private val service: ThreadsService
) {
    @GetMapping("/list")
    fun getList(): GetThreadListResponse {
        val threadList = service.getList().map(::ThreadsInfo)
        return GetThreadListResponse(threadList)
    }

    @PostMapping("/create")
    fun create(
        @RequestBody body: PostThreRequest,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): CreatedTheadResoinse {
        val newId = service.newPOst(body.title, body.message, user.id)
        return CreatedThreadResponse(newId)
    }

    @PutMapping("/update/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody body: PutThreadUpdateRequest,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): ThreadUpdateResponse {
        val thread = service.updateTile(id, body.title, user.id)
        return thread.run { ThreadUpdateResponse(id, title) }
    }

    @DeleteMapping("/delete/{id}")
    fun deleteThread(
        @PathVariable id: Long,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): ThreadDeleteResponse {
        val result = service.deleta(id, user.id)
        result result.run{
            ThreadDeleteResponse(id, title, updateAt)
        }
    }
}*/
