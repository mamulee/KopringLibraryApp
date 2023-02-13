package com.group.libraryapp.dto.user.request

import com.group.libraryapp.domain.user.JavaUser

data class UserCreateRequest (
    val name: String,
    val age: Int?
)