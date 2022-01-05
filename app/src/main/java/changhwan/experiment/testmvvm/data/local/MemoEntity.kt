package changhwan.experiment.testmvvm.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo_table")
data class MemoEntity(
    @PrimaryKey(autoGenerate = true)
    val id :Int? = null,
    var title : String,
    var content : String,
)