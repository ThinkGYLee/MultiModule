package com.gyleedev.multimodule.data

import javax.inject.Inject

interface UserRepository {

    fun getUserId(): String?
}

internal class UserRepositoryImpl @Inject constructor() : UserRepository {

    override fun getUserId(): String? {
        return null
    }
}