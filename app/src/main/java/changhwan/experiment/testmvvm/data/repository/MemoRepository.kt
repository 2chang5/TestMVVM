package changhwan.experiment.testmvvm.data.repository

import changhwan.experiment.testmvvm.data.local.MemoEntity
import changhwan.experiment.testmvvm.ui.view.memo.MemoData

interface MemoRepository {

    suspend fun getMemos() : List<MemoEntity>

    suspend fun setMemos(data: MemoEntity)
}