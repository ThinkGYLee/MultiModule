package com.gyleedev.multimodule.ui.feed

import androidx.lifecycle.ViewModel
import com.gyleedev.multimodule.domain.GetUserUserCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(userCase: GetUserUserCase) : ViewModel() {

    init {

        val userId = userCase().also { println(it) }

    }

    private val a = "bb"
}