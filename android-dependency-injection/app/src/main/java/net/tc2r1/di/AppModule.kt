package net.tc2r1.di

import android.content.Context
import dagger.Module
import dagger.Provides
import net.tc2r1.data.UserPreferences
import net.tc2r1.data.network.AuthApi
import net.tc2r1.data.network.RemoteDataSource
import javax.inject.Singleton

@Module
class AppModule(
    private val context : Context

) {

    @Singleton
    @Provides
    fun provideAuthApi(remoteDataSource: RemoteDataSource): AuthApi {
        return remoteDataSource.buildApi(AuthApi::class.java, context)
    }

    @Singleton
    @Provides
    fun provideUserPreferences(): UserPreferences {
        return UserPreferences(context)
    }
}