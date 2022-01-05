package changhwan.experiment.testmvvm.ui.view.memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import changhwan.experiment.testmvvm.R
import changhwan.experiment.testmvvm.databinding.ActivityMainBinding
import changhwan.experiment.testmvvm.databinding.ActivityMemoBinding
import changhwan.experiment.testmvvm.ui.base.BaseActivity
import changhwan.experiment.testmvvm.ui.viewmodel.MemoViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.bind
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.compat.ScopeCompat.viewModel

class MemoActivity : BaseActivity<ActivityMemoBinding>(R.layout.activity_memo) {

    private lateinit var memoAdapter: MemoAdapter
    private val viewModel : MemoViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()
        initInsertMemo()
    }

    private fun initAdapter(){
        memoAdapter = MemoAdapter()
        binding.rvMemo.adapter = memoAdapter
        viewModel.memoList.observe(this){
            memoAdapter.memoList.addAll(it)
            memoAdapter.notifyDataSetChanged()
        }

    }

    private fun initInsertMemo(){
        binding.btnMemoEdit.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                viewModel.insertMemo(binding.etMemoTitle.text.toString(),binding.etMemoContent.text.toString())
            }
            memoAdapter.notifyDataSetChanged()
        }
    }
}
