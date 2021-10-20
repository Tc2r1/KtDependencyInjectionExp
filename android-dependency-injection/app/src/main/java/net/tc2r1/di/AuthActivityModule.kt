package net.tc2r1.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.tc2r1.ui.auth.AuthActivity

@Module
abstract class AuthActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivityInjector(): AuthActivity
}