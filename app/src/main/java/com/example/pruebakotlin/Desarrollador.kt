package com.example.pruebakotlin

class Desarrollador(var nombre:String,
                    var edad:Int,
                    var lista: Array<Lenguaje>,
                    var cadena:String? = null,
                    var valor:String = "",
                    var longitud:Int) {

    enum class Lenguaje{
        JAVA,
        KOTLIN,
        C
    }


}