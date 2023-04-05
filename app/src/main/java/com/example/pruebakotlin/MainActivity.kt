package com.example.pruebakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.pruebakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.textWelcome.setText("bienvenido a kotlin")

        binding.textWelcome.setText(miPrimerMetodo("otro simple texto"))

        casosWhen()

        arreglos()

        mapas()

        ciclos()

        nulos()

        clases()
    }

    private fun miPrimerMetodo(val1: String): String {

        println("impresion en consola")
        var variable: String = ""
        val constante: String = "valor constante"

        //constante para posterior inicialiciacion
        lateinit var constante2: String

        constante2 = "valor posterior"


        return val1
    }

    private fun casosWhen() {

        var pais: String = "Mexo"

        when (pais) {
            "Mexico" -> {
                println("pais Mexico")
            }
            "España" -> {
                println("pais españa")
            }
            "USA" -> {
                println("pais usa")
            }
            else -> {
                println("otro pais")
            }
        }

        var numero: Int = 5

        when (numero) {
            1, 2, 3 -> {
                println("valores menores a 3 hasta 1")
            }
            in 3..10 -> {
                println("rango de valores")
            }
            in 11..15 -> {
                println("otro rango de valores")
            }
            else -> {
                println("ninguno de los valores")
            }
        }

    }

    private fun arreglos() {
        val nombre = "juan"
        val estado = "michoacan"
        val edad = "18"
        val miLista: ArrayList<String> = arrayListOf()

        miLista.add(nombre)
        miLista.add(estado)
        miLista.add(edad)

        println(miLista.toString())

        miLista.addAll(listOf<String>("hola", "otro valor"))

        print(miLista.get(0))

        miLista.forEach {
            println(it)
        }
    }

    private fun mapas() {

        var miMapa: Map<String, Int> = mapOf()
        println(miMapa)
        miMapa = mapOf("Juan" to 1, "Pedro" to 2)
        miMapa = mapOf("Juan" to 1, "Pedro" to 2)
        println(miMapa.toString())

        //para seguir añadiendo valores se necesita hacer mutable el map
        var miMapa2: Map<String, Int> = mapOf()
        println(miMapa2)
        miMapa2 = mutableMapOf("Juan" to 1, "Pedro" to 2)
        println(miMapa2.toString())

        miMapa2["Fransisco"] = 3
        miMapa2.put("Jose", 4)
        println(miMapa2.toString())
        println(miMapa2["Juan"])
        miMapa2.remove("Juan")
        println(miMapa2)
    }

    private fun ciclos() {
        val nombre = "juan"
        val estado = "michoacan"
        val edad = "18"
        val miLista: ArrayList<String> = arrayListOf()
        miLista.add(nombre)
        miLista.add(estado)
        miLista.add(edad)

        for (elemento in miLista) {
            println(elemento)
        }

        for (i in 0..10) {
            println(i)
        }

        for (i in 0 until 10) {
            println(i)
        }

        for (i in 0..10 step 2) {
            println(i)
        }

        for (i in 10 downTo 0) {
            println(i)
        }

        val array = (0..20)
        var x = 0
        while (x < 10) {
            println(x)
            x++
        }
        array.forEach {
            println(it)
        }

        var listAuto: ArrayList<Auto> = arrayListOf()

        /* lateinit var  auto:Auto
         auto.color = "rojo"
         auto.modelo = 2001
         auto.nombre = "chevy"

         listAuto.add(auto)

         listAuto.forEach {
             println(it.nombre)
             println(it.modelo)
             println(it.color)
         }*/
    }

    private fun nulos() {
        //null safety
        var cadena: String? = "cadena"
        cadena = null
        println(cadena)

        //safe call
        //println(cadena.length)
        println(cadena?.length)

        cadena?.let {
            println(it.toString())
        } ?: kotlin.run {
            println("ejecucion en caso de valor nulo")
        }


        println(cadena("valor"))
    }

    fun cadena(cad: String): String {
        return "funcion para retornar valor$cad"
    }

    fun clases() {

        var clase = Desarrollador(
            "josee",
            20,
            arrayOf(Desarrollador.Lenguaje.KOTLIN, Desarrollador.Lenguaje.JAVA),
            "",
            "",
            10
        )

        println(clase.nombre + " " + clase.edad)
    }
}