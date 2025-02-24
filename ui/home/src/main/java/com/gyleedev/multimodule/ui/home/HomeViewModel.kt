package com.gyleedev.multimodule.ui.home

import androidx.lifecycle.ViewModel
import com.gyleedev.multimodule.domain.GetUserUserCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel  @Inject constructor(userCase: GetUserUserCase) : ViewModel() {

    init {

        val userId = userCase()
    }
}