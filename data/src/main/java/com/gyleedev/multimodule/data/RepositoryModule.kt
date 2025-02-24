package com.gyleedev.multimodule.data

import com.gyleedev.multimodule.domain.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class RepositoryModule {

    @Provides
    @Singleton
    fun providesUserRepository(): UserRepository = UserRepositoryImpl()
}