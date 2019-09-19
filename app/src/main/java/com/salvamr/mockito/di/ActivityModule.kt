package com.salvamr.mockito.di

import com.salvamr.mockito.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @ContributesAndroidInjector
    fun provideMainActivity(): MainActivity
}