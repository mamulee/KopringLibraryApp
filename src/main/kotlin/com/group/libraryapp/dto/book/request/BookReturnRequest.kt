package com.group.libraryapp.dto.book.request

import com.group.libraryapp.domain.user.JavaUser

data class BookReturnRequest (
    val userName: String,
    val bookName: String
)