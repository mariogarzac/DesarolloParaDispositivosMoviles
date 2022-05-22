package com.example.repasoparcial2

import androidx.lifecycle.ViewModel

class TodoViewModel: ViewModel() {

    private val _todos = mutableListOf<Todo>()

    val todoList get() = _todos

    fun newToDo(title: String, descripcion: String) {
        val newTodo = Todo(title,descripcion)
        _todos.add(newTodo)
    }


}