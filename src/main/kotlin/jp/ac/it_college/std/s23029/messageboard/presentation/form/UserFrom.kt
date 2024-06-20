package jp.ac.it_college.std.s23029.messageboard.presentation.form

import jp.ac.it_college.std.s23029.messageboard.domain.model.Users

data class RegisterUserRequest(
    val viewName: String,
    val email: String,
    val password: String
) {
    fun toModel(): Users {
        return Users(
            id = 0L,
            viewName,
            email,
            password
        )
    }
}