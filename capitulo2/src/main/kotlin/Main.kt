
fun main(args: Array<String>) {
    /*-*-*Variables primitivas en kotlin-*-*-*-*-*-*/
    /*var: Si la variable cambiara su valor
    * val: Si la variable no cambiará su valor
    * */

    var nombre:String="Edgardo"
    var edad:Int=30
    var calificacion:Double=8.5
    var sexo:Char='H'

    println("Hola $nombre tu edad es ${edad.inc()}".plus(" eres ").plus(sexo))

    /*
    When en kotlin
    * */
    var mensaje:String= when{
        calificacion<6-> "Reprobado"
        calificacion>6 && calificacion <9-> "Aprobado"
        calificacion>9-> "Aprobado felicidades"
        else -> {
            "calificacion incorrecta"
        }
    }


    println(mensaje)

    /*repeat*/
    repeat(10){
        println("hola")
    }


    /*Manejo de nulos en Kotlin*/
    var cadena:String? = null

    println(cadena?.startsWith("H")?:"el valor es nulo")
    println(cadena!!.startsWith("h"))


}