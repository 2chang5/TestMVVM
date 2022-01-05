package changhwan.experiment.testmvvm.ui.view.main

import android.content.Intent
import android.os.Bundle
import changhwan.experiment.testmvvm.R
import changhwan.experiment.testmvvm.databinding.ActivityMainBinding
import changhwan.experiment.testmvvm.databinding.MemoItemBinding
import changhwan.experiment.testmvvm.ui.base.BaseActivity
import changhwan.experiment.testmvvm.ui.view.memo.MemoActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initMemoButton()
    }

    private fun initMemoButton() {
        binding.btnToMemo.setOnClickListener{
            val intent = Intent(this, MemoActivity::class.java)
            startActivity(intent)
        }
    }
}