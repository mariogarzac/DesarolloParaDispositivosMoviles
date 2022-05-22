package com.example.repasoparcial2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.example.repasoparcial2.databinding.FragmentAltaBinding
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Use the [RetiroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RetiroFragment : Fragment() {

    private val viewModel : MovimientoViewModel by activityViewModels()
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

        binding.buttonRetiros.setOnClickListener {

            var monto = binding.editTextMonto.text.toString().toDouble()
            val fechaDeMovimiento = Date()
            if (viewModel.verifyBalance(monto)) {
                viewModel.updateBalance(monto)
                viewModel.newMovimiento("retiro" ,monto, fechaDeMovimiento)
            }else{
                Toast.makeText(activity,"No hay suficiente dinero en la cuenta",Toast.LENGTH_SHORT).show()
            }




        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}