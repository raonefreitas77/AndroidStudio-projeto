package com.example.aula01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnCalcular = findViewById<Button>(R.id.btnCalculo)
        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editAltura =  findViewById<EditText>(R.id.editAltura)
        val txtIMC =  findViewById<TextView>(R.id.txtIMC)

        btnCalcular.setOnClickListener {
            val peso = editPeso.text.toString().toFloatOrNull()
            val altura = editAltura.text.toString().toFloatOrNull()

            if(peso != null && altura != null){
                var IMC = (peso/(altura*altura))

                if(IMC<18.5){

                    txtIMC.text= "IMC: %.2f ; abaixo do peso".format(IMC)

                }else if(IMC>=18.5 || IMC<=24.9){

                    txtIMC.text= "IMC: %.2f ; peso normal".format(IMC)

                }else if(IMC>=25 || IMC<=29.9){

                    txtIMC.text= "IMC: %.2f ; sobrepeso".format(IMC)

                }else if(IMC>=30 || IMC<=34.9){

                    txtIMC.text= "IMC: %.2f ; obesidade classe 1".format(IMC)

                }else if(IMC>=35 || IMC<=39.9){

                    txtIMC.text= "IMC: %.2f ; obesidade classe 2".format(IMC)
                }
            }else{
                txtIMC.text="Apresente valores validos"
            }


        }


    }
}