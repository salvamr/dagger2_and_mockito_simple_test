package com.salvamr.mockito.di

import android.content.Context
import com.salvamr.mockito.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApplication(app: App): Context = app.applicationContext
}