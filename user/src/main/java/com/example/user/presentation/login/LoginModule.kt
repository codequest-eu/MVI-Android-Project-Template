package com.example.user.presentation.login

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
internal class LoginModule {

    @Provides
    fun provideInitialLoginViewState(): LoginViewState = LoginViewState()
}
