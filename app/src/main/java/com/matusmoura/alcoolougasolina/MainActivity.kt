package com.matusmoura.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

abstract class MainActivity : AppCompatActivity() {

    abstract var  alcoolPrice:TextInputEditText
    abstract var  gasolinePrice:TextInputEditText
    abstract var  result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alcoolPrice = findViewById(R.id.alcoolPrice)
        gasolinePrice = findViewById(R.id.gasolinePrice)
        result = findViewById(R.id.textResult)


    }

    fun Calculation(view: View){
        var alcoolPrice:String = alcoolPrice.text.toString()
        var gasolinePrice:String = gasolinePrice.text.toString()

       var campOk: Boolean = okCamp(gasolinePrice,alcoolPrice)
        if (campOk){
            var alcoolValue: Double = alcoolPrice.toDouble()
            var gasolineValue: Double = gasolinePrice.toDouble()

            val ratio: Double = alcoolValue / gasolineValue

            if (ratio < 0.7) {
                result.setText("Melhor opção: Álcool")
            } else {
                result.setText("Melhor opção: Gasolina")
            }

        }else {
            result.setText("Preenca todos os campos de preços!")
        }

    }

    fun okCamp (pAlcool: String, pGasoline: String ):Boolean{
        var campOK: Boolean = true

        if (pAlcool == null || pAlcool.equals("") || pGasoline == null || pGasoline.equals(""))
            campOK = false
        return campOK
    }
}