

fun main(args: Array<String>) {
    /*Instancia de clase*/
    /*
    var auto1:Automovil = Automovil(marca = "vw", tipo = "hatchback")
    println(auto1)
    println(auto1.cambiarMarcaMayuscula())
    println(auto1.union())
    */


    /*método de extensión*/
    var dato:String="+2A500"
    println(dato.isNumber())

    /*herencia*/
    var lava1:Lavadora = Lavadora("GE",25000.0)
    var auto1:Bocho = Bocho("vw", 850000)

    accion(lava1)
    accion(auto1)

    accion2(lava1)
    /*accion2(auto1)*/

    var ob:Pair<String, Lavadora> = Pair("lav1", lava1)
    println(ob.first)
    println(ob.second)

    var mapa:Map<Int, Lavadora> = mapOf(1 to lava1, 2 to Lavadora("Samsung", 15000.0))
    mapa.forEach{(k,v) -> println("key: $k  valor: $v")}

    /*-*-*-*-*-*-*-*-*-**/
    println(Singleton.getInstance())

    /*-*-*-*-*-*-*-*-*-*-*-*/
    Prueba.fun1()

}

object Singleton{

    fun getInstance():String{
        return "instancia"
    }

}




class Prueba{
    fun pr(){

    }


    companion object /*Estaticos*/{
        fun fun1(){
            println("funcion1")
        }
        fun fun2(){
            println("funcion2")
        }

    }

}






fun accion(objecto:Botones){
    objecto.prender()
    objecto.apagar()
}

fun accion2(objecto:Electrodomestico){
    objecto.funElectrodosmetico()
}

/*Metodos de extensión*/
/*fun Automovil.union():String{
    return "marca ${this.marca} tipo ${this.tipo}"
}*/

/*Metodos de extensión de clases existentes*/
fun String.isNumber():Boolean{
    return this.matches("([-,+])?[0-9]+".toRegex())
}