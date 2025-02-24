package com.gyleedev.multimodule.data

import com.gyleedev.multimodule.domain.UserRepository
import javax.inject.Inject


internal class UserRepositoryImpl @Inject constructor() : UserRepository {

    override fun getUserId(): String? {
        return null
    }
}