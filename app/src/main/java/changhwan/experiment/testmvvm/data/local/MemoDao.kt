package changhwan.experiment.testmvvm.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MemoDao {
    @Insert
    fun insert(memoEntity: MemoEntity)

    @Update
    fun update(memoEntity: MemoEntity)

    @Query("SELECT * FROM memo_table")
    fun getAll(): List<MemoEntity>
}