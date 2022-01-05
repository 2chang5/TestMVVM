package changhwan.experiment.testmvvm.ui.view.memo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import changhwan.experiment.testmvvm.data.local.MemoEntity
import changhwan.experiment.testmvvm.databinding.ActivityGitInfoBinding
import changhwan.experiment.testmvvm.databinding.ActivityMemoBinding
import changhwan.experiment.testmvvm.databinding.MemoItemBinding

class MemoAdapter : RecyclerView.Adapter<MemoAdapter.MemoViewHolder>() {
    val memoList = mutableListOf<MemoEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        val binding = MemoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MemoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MemoViewHolder, position: Int) {
        holder.onBind(memoList[position])
    }

    override fun getItemCount(): Int = memoList.size

    class MemoViewHolder(private val binding: MemoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: MemoEntity) {
            binding.memoData = data
        }
    }
}