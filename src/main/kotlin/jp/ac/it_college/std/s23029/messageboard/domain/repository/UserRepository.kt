package jp.ac.it_college.std.s23029.messageboard.domain.repository

import jp.ac.it_college.std.s23029.messageboard.domain.model.Users

interface UserRepository {
    fun findByEmail(email: String): Users?

    fun findById(id: Long): Users?

    fun createUser(user: Users): Users

    fun updateUser(user: Users): Users

    fun deleteUser(id: Long)
}