package com.mariogarzac.parcialdos

import androidx.lifecycle.ViewModel
import java.util.*

class MovimientosViewModel: ViewModel() {

    private var _movimientos = mutableListOf<Movimientos>()
    val movimientos get() = _movimientos

    fun newMovimiento(tipo_movimientos : String, cantidad : Double, fecha : Date){
        val newMovimiento = Movimientos(tipo_movimientos, cantidad, fecha)
        _movimientos.add(newMovimiento)
    }
}