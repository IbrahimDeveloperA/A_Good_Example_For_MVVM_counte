package com.example.udalipotom.ui

import com.example.udalipotom.R
import com.example.udalipotom.databinding.FragmentThereBinding
import com.example.udalipotom.ui.basefragment.BaseFragment

class ThereFragment : BaseFragment<FragmentThereBinding>(R.layout.fragment_there) {

    override fun inflateViewBinding(): FragmentThereBinding {
        return FragmentThereBinding.inflate(layoutInflater)
    }

    override fun initView() {
        viewModels.text.observe(this){
            binding.tvText.text = it
        }
    }

}