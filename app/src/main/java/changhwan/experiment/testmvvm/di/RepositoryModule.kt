package changhwan.experiment.testmvvm.di

import changhwan.experiment.testmvvm.data.repository.MemoRepository
import changhwan.experiment.testmvvm.data.repository.MemoRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<MemoRepository>{ MemoRepositoryImpl(db = get())}
}