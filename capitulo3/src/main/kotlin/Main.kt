
fun main(args: Array<String>) {

    crearCadena("valor1")
    crearCadena(dato1="javier", dato3=21)

    /*Expresiones lambda*/
    var lambda1:(String)->Boolean = {t-> t.endsWith(".jpg")}
    var lambda2:(String) -> Boolean = {it.startsWith("http") }

    println("Lambda 1 ${lambda1("archivo.png")}")
    println("lambda 2 ${lambda2("http://url.com")}")

    accion("archivo.jpg", lambda2)

    /*filtros y mapeos*/
    var lista:List<String> = listOf("Pablo","Ulises", "Luis","Misael", "Marco")

    var filtro1:List<String> = lista.filter{it.startsWith("M")}
    println(filtro1)
    println("-*-*-*-*-*")
    lista.asSequence().filter() { it.endsWith("s") }.forEach { println(it) }

    var mapeo:List<String> = lista.map { it.substring(0,2).uppercase() }
    println(mapeo)


}

fun accion(dato1:String, lambda:(String)->Boolean){
    println("lambda: ${lambda(dato1)}")
}

fun crearCadena(dato1:String, dato2:String="default", dato3:Int=0)=println("dato1: $dato1,  dato2: $dato2, dato3: $dato3")
