package com.example.repasoparcial2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.repasoparcial2.databinding.ItemTodosBinding

class Adapter(var movimientos: MutableList<Movimiento>) : RecyclerView.Adapter<Adapter.ViewHolder>()
{
    class ViewHolder(val binding: ItemTodosBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemTodosBinding.inflate(layoutInflater,parent,false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            textViewMovimiento.text = movimientos[position].tipo_movimiento
            textViewMonto.text = movimientos[position].cantidad.toString()
            textViewFecha.text = movimientos[position].fecha.toString()
        }


    }

    override fun getItemCount(): Int {
        return movimientos.size
    }
}