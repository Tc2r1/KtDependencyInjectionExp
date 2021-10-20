package net.tc2r1.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import net.tc2r1.MyApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    LoginFragmentModule::class,
    AppModule::class,
    AuthActivityModule::class
])
interface AppComponent {

    fun inject(application: MyApplication)

}