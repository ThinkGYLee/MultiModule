package com.gyleedev.multimodule.domain

import javax.inject.Inject

class GetUserUserCase @Inject constructor(private val repository: UserRepository) {

    operator fun invoke(): String? = repository.getUserId()
}