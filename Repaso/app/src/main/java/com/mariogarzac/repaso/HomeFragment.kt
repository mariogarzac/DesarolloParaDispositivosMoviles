package com.mariogarzac.repaso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.mariogarzac.repaso.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val viewModel : TodoViewModel by activityViewModels()
    private var _binding : FragmentHomeBinding? = null
    private val binding  get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.newTodo("prueba", "prueba")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}