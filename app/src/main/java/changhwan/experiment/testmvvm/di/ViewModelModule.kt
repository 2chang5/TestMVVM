package changhwan.experiment.testmvvm.di

import changhwan.experiment.testmvvm.ui.viewmodel.MemoViewModel
import org.koin.androidx.viewmodel.compat.ScopeCompat.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{ MemoViewModel(get())}
}