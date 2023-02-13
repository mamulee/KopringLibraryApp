package com.group.libraryapp.dto.user.request

import com.group.libraryapp.domain.user.JavaUser

data class UserUpdateRequest (
    val id: Long,
    val name: String
)