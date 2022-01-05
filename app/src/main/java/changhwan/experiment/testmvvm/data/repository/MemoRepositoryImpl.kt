package changhwan.experiment.testmvvm.data.repository

import changhwan.experiment.testmvvm.data.local.MemoDatabase
import changhwan.experiment.testmvvm.data.local.MemoEntity
import changhwan.experiment.testmvvm.ui.view.memo.MemoData
import org.koin.java.KoinJavaComponent.inject

class MemoRepositoryImpl(private val db: MemoDatabase) : MemoRepository {

    override suspend fun getMemos(): List<MemoEntity> {
        return db.memoDao().getAll()
    }

    override suspend fun setMemos(data: MemoEntity) {
        db.memoDao().insert(data)
    }
}