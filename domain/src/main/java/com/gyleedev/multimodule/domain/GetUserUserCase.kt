package com.gyleedev.multimodule.domain

import com.gyleedev.multimodule.data.UserRepository
import javax.inject.Inject

class GetUserUserCase @Inject constructor(private val repository: UserRepository) {

    operator fun invoke(): String? = repository.getUserId()
}