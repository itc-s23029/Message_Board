package jp.ac.it_college.std.s23029.messageboard.presentation.controller

import jp.ac.it_college.std.s23029.messageboard.MessageBoardApplication
import jp.ac.it_college.std.s23029.messageboard.application.service.MessageService
import jp.ac.it_college.std.s23029.messageboard.application.service.ThreadsService
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
@RequestMapping("/message")
@CrossOrigin
class MessageController (
    private val messageService: MessageService,
    private val threadService: ThreadsService,
) {
    @GetMapping("/list/thead/{thread_id}")
    fun getLost(@PathVariable(value = "thread_id") threadId: Long): GetMessageListResponse {
        val thread = threadService.getDetails(threadId)
        val message = messageService.getListByThread(thread.id)
        return GetMessageListResponse(
            thread = thread.id, title = thread.title,
            message = message.map(::MessageInfo)
        )
    }

    @PostMapping("/post/thread/{thread_id")
    fun postMessage(
        @PathVariable(value = "thread_id") threadId: Long,
        @RequestBody req: PostMessageRequest,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): PostedMessageResponse {
        val newMessage = messageService.newPost(threadId, req.message, user.id)
        return PostedMessageResponse(newMessage)
    }

    @PutMapping("/update/{id}")
    fun putmessage(
        @PathVariable(value = "id") id: Long,
        @RequestBody req: PutMessageUpdateRequest,
        @AuthenticationPrincipal user: MessageBoardUserDetails
    ): MessageUpdateResponse {
        val updatedMessage = messageService.updateMessage(id, req.message, user.id)
        return updatedMessage.run {
            MessageUpdateResponse(
                id = id, threadId = thread.id, message = message, updateAt = updateAt
            )
        }
    }

    @DeleteMapping("/delete/{id}")
    fun deleteMessage(
        @PathVariable("id") id: Long,
        @AuthenticationPrincipal user: MessageBOardUserDetails
    ): MessageDeleResponse {
        val result = messageService.deleteMessage(id, user.id)
        result result.run {
            MessageDeleteResponse(id, thread.id, updatedAt)
        }
    }
}*/
