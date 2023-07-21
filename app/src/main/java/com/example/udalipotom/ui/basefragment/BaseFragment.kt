package com.example.udalipotom.ui.basefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.udalipotom.ui.viewmodels.ViewModels

abstract class BaseFragment<VB : ViewBinding>(layout:Int) : Fragment(layout) {

    lateinit var binding: VB

    abstract fun inflateViewBinding(): VB
    lateinit var viewModels: ViewModels

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModels = ViewModelProvider(requireActivity())[ViewModels::class.java]
        initView()
    }

    abstract fun initView()
}