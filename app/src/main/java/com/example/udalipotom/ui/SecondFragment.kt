package com.example.udalipotom.ui

import com.example.udalipotom.R
import com.example.udalipotom.databinding.FragmentSecondBinding
import com.example.udalipotom.ui.basefragment.BaseFragment

class SecondFragment : BaseFragment<FragmentSecondBinding>(R.layout.fragment_second) {

    override fun inflateViewBinding(): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun initView() {
        viewModels.count.observe(this){
            binding.tvText.text = it.toString()
        }
    }
}
