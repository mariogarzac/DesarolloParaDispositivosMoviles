package com.example.repasoparcial2

import android.widget.Toast
import androidx.lifecycle.ViewModel
import java.util.*

class MovimientoViewModel: ViewModel() {

    private val _movimientos = mutableListOf<Movimiento>()
    var balance : Double = 5000.00
    val movimientos get() = _movimientos

    fun newMovimiento(tipo_movimiento: String, cantidad: Double, fecha: Date) {
        val newMovimiento = Movimiento(tipo_movimiento, cantidad, fecha)
        _movimientos.add(newMovimiento)
    }

    fun updateBalance(cantidad : Double){
            balance -= cantidad
    }

    fun verifyBalance(cantidad :Double) : Boolean{
        if (balance < cantidad){
            return false
        }
        return true
    }

    fun getSize() : Int{
        return _movimientos.size
    }



}