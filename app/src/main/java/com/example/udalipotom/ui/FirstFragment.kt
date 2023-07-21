package com.example.udalipotom.ui

import com.example.udalipotom.R
import com.example.udalipotom.databinding.FragmentFirstBinding
import com.example.udalipotom.ui.basefragment.BaseFragment

class FirstFragment : BaseFragment<FragmentFirstBinding>(R.layout.fragment_first) {

    override fun inflateViewBinding(): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun initView() {
        binding.btnPlus.setOnClickListener {
            viewModels.increment()
        }

        binding.btnMinus.setOnClickListener {
            viewModels.decrement()
        }

        binding.btnClear.setOnClickListener {
            viewModels.setNull()
        }
    }
}