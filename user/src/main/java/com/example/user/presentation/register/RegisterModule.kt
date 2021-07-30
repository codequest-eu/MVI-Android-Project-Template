package com.example.user.presentation.register

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class RegisterModule {
    @Provides
    fun provideInitialRegisterViewState(): RegisterViewState = RegisterViewState()
}
