package com.mariogarzac.repaso

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariogarzac.repaso.databinding.FragmentListaBinding
import com.mariogarzac.repaso.databinding.ItemTodoBinding

class Adapter (var todos : List<Todo>) : RecyclerView.Adapter<Adapter.ViewHolder>(){

    class ViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemTodoBinding.inflate(layoutInflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply{
            titleTextView.text = todos[position].titulo
            titleTextView.text = todos[position].descripcion
        }

    }

    override fun getItemCount(): Int {
        return todos.size
    }


}