package changhwan.experiment.testmvvm.di

import androidx.room.Room
import changhwan.experiment.testmvvm.data.local.MemoDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val roomModule = module {

    single{
        Room.databaseBuilder(
            //koin에서 context요구할때 전역 context인  androidApplication() 혹은 androidContext()를 사용하면된다
            androidApplication(), MemoDatabase::class.java,"sopt-database")
            .fallbackToDestructiveMigration()
            .build()
    }
}