import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main(args: Array<String>) {
    /*Hilos con executor service*/
    var pool:ExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
    (1..100).forEach {
        pool.submit{
            println("Tarea $it es ejecutado por el hilo: ${Thread.currentThread().name}")
        }
    }
    pool.shutdown()

    /*Hilos con las corrutinas*/

    /*Scope*/
    runBlocking{
        println("hilo main: ${Thread.currentThread().name}")

        withContext(Dispatchers.Default){
            println("hilo? : ${Thread.currentThread().name}")

            withContext(Dispatchers.Unconfined){
                println("hilo? : ${Thread.currentThread().name}")
            }

        }

    }


}