package com.example.homework4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var count = 0
    var plus = ""
    val counter = MutableLiveData<String>()

    val operations = MutableLiveData<String>()


    fun increment() {
        count++
        counter.value = count.toString()
        plus = "\n +$plus"
        operations.value = plus    }

    fun decrement() {
        count--
        counter.value = count.toString()
        plus = "\n - $plus "
        operations.value = plus
    }
}