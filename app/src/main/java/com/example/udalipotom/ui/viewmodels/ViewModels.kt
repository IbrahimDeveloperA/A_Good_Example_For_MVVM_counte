package com.example.udalipotom.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModels() : ViewModel() {

    private var counter = 0
    var tex = ""
    val count = MutableLiveData<Int>()
    var text = MutableLiveData<String>()

    fun increment() {
        counter++
        count.postValue(counter)
        tex = "\n + $tex"
        text.value  = tex
    }

    fun decrement() {
        counter--
        count.postValue(counter)
        tex = "\n - $tex"
        text.value = tex
    }

    fun setNull(){
        tex = "\n"
        text.value = tex
        counter = 0
        count.postValue(counter)
    }

}