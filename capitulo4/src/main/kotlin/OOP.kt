
/*
class Automovil{
    var marca:String
        get() {
            return this.marca
        }
        set(value)  {
            this.marca=value
        }

    var tipo:String
        get(){return this.tipo}
        set(value){
            this.tipo=if(value.isNotEmpty()) value else "sin asignar"
        }

    constructor(marca:String, tipo:String){
        this.marca=marca
        this.tipo=tipo
    }

}*/
/*
data class Automovil(var marca:String, var tipo:String){

    fun cambiarMarcaMayuscula():String{
        return this.marca.uppercase()
    }
}*/


interface Botones{
    fun prender()
    fun apagar()
}


open abstract  class Electrodomestico(open var marca:String, open var precio:Double):Botones {
     open fun funElectrodosmetico(){
        println("Accion")
    }
}

open abstract class Automovil(var marca:String, var kilometraje:Long):Botones

open abstract class Celular(var marca:String, var almacenamienoGB:Int):Botones


data class Lavadora(override var marca: String, override var precio: Double) : Electrodomestico(marca, precio) {
    override fun prender() {
       println("Lavadora prendiendo")
    }

    fun soloLavadora(){

    }

    override fun apagar() {
        println("Lavadora apagando")
    }

    override fun funElectrodosmetico() {
        println("Funcion lavadora")
    }

}

 class Bocho(marca: String, kilometraje: Long) : Automovil(marca, kilometraje) {
    override fun prender() {
       println("Prender bocho")
    }

    override fun apagar() {
        println("Apagar bocho")
    }

}