package net.tc2r1.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.tc2r1.ui.auth.LoginFragment

@Module
abstract class LoginFragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeLoginFragmentInjector() : LoginFragment
}