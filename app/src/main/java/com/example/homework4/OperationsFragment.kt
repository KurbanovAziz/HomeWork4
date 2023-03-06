package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homework4.databinding.FragmentOperationsBinding

class OperationsFragment : Fragment() {

    private lateinit var binding: FragmentOperationsBinding
    private lateinit var viewModel: CounterViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View{
        binding = FragmentOperationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]
        viewModel.operations.observe(viewLifecycleOwner) {
            binding.tv.text = it
        }

    }
}