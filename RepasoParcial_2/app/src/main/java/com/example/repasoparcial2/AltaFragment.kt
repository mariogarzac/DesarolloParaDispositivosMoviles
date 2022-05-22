package com.example.repasoparcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.repasoparcial2.databinding.FragmentAltaBinding
import com.example.repasoparcial2.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [AltaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AltaFragment : Fragment() {


    private val viewModel : TodoViewModel by activityViewModels()
    private var _binding: FragmentAltaBinding? = null
    private val binding get () = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAltaBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAltas.setOnClickListener {

            val titulo = binding.editTextTitulo.text.toString()
            val descripcion = binding.editTextDesc.text.toString()

            viewModel.newToDo(titulo,descripcion)

            Toast.makeText(activity,"Tarea dada de Alta",Toast.LENGTH_SHORT).show()
         //   binding.editTextTitulo.setText("")
         //   binding.editTextDesc.setText("")

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}