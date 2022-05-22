package com.example.repasoparcial2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.repasoparcial2.databinding.ItemTodosBinding

class Adapter (var todos: List<Todo>) : RecyclerView.Adapter<Adapter.ViewHolder>()
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
            textViewTitle.text = todos[position].title
            textViewDesc.text = todos[position].description
        }


    }

    override fun getItemCount(): Int {
        return todos.size
    }
}