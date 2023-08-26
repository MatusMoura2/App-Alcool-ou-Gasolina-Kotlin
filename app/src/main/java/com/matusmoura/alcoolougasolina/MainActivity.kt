package com.matusmoura.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

abstract class MainActivity : AppCompatActivity() {

    abstract var editPriceAlcool:    TextInputEditText
    abstract var editPriceGasoline:  TextInputEditText
    abstract var resultCalc:         TextView

    fun validation(pAlcool: String, pGasoline: String):Boolean{
        var campOk = true

        if(pAlcool == null || pAlcool.equals("") || pGasoline == null || pGasoline.equals("")){
            campOk = false
        }


        return campOk
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPriceAlcool     = findViewById(R.id.idAlcoolPrice)
        editPriceGasoline   = findViewById(R.id.idGasolinePrice)
        resultCalc          = findViewById(R.id.textResult)

        fun calculatePrice(view: View): Unit{
            var priceAlcool    = editPriceAlcool.text.toString()
            var priceGasoline  = editPriceGasoline.text.toString()

            var teste: Boolean = validation(priceAlcool, priceGasoline)


        }
    }
}