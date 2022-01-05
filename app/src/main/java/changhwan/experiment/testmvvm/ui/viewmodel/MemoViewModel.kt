package changhwan.experiment.testmvvm.ui.viewmodel

import androidx.lifecycle.*
import changhwan.experiment.testmvvm.data.local.MemoEntity
import changhwan.experiment.testmvvm.data.repository.MemoRepository
import changhwan.experiment.testmvvm.ui.view.memo.MemoActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.reflect.KProperty

class MemoViewModel(private val memoRepository: MemoRepository) : ViewModel() {

//    val memoList : LiveData<List<MemoEntity>> = liveData(Dispatchers.IO){
//        memoIsLoading.postValue(true)
//        emit(memoRepository.getMemos())
//        memoIsLoading.postValue(false)
//    }

    val memoList : LiveData<List<MemoEntity>>
        get() = _memoList

    private val _memoList = MutableLiveData<List<MemoEntity>>()


    suspend fun insertMemo(title:String, content: String){
        memoRepository.setMemos(MemoEntity(title = title,content = content))
    }

    fun updateMemoList(){
        viewModelScope.launch{

        }
    }

    fun initMemoList(){
        viewModelScope.launch {
            _memoList.value = memoRepository.getMemos()
        }
    }

}