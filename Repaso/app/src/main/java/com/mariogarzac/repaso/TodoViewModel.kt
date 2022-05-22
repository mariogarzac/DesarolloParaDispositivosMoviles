package com.mariogarzac.repaso
import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {

    private var _todos = mutableListOf<Todo>()

    val todoList get() = _todos

    fun newTodo(titulo : String, descripcion : String){
        val newTodo = Todo(titulo,descripcion)
        _todos.add(newTodo)
    }

}