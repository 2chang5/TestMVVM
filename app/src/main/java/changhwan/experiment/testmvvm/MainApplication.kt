package changhwan.experiment.testmvvm

import android.app.Application
import changhwan.experiment.testmvvm.di.repositoryModule
import changhwan.experiment.testmvvm.di.roomModule
import changhwan.experiment.testmvvm.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(roomModule)
            modules(repositoryModule)
            modules(viewModelModule)
        }
    }
}