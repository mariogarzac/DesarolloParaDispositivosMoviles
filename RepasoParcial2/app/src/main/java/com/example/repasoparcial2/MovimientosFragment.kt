package com.example.repasoparcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.repasoparcial2.databinding.FragmentListaBinding


/**
 * A simple [Fragment] subclass.
 * Use the [MovimientosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MovimientosFragment : Fragment() {

    private val viewModel : MovimientoViewModel by activityViewModels()
    private var _binding: FragmentListaBinding? = null
    private val binding get () = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentListaBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = Adapter(viewModel.movimientos)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(activity)

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}