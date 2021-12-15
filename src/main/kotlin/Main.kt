

fun imprimirVelas(edad:Int){
    var i= 0
    var j= 0
    print(" ")
    do{
        print(",")
        i++
    }while (i<edad)
    print("\n")
    print(" ")
    do{
        print("|")
        j++
    }while (j<edad)
    print("\n")
}

fun imprimirCapaSup(edad: Int){
    var j= 0
    print(" ")
    do{
        print("=")
        j++
    }while (j<edad)
}

fun imprimirCapasInf(edad: Int,capas:Int){
    var i = 0
    while (i < capas){
        println("")
        var j= 0
        print(" ")
        do{
            print("@")
            j++
        }while (j<edad)
        i++

    }
}

fun imprimirMensaje(mensaje:String, edad: Int){
    val cantidad = edad/2
    val men = mensaje.padStart(cantidad, ' ')
    println("''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''")
    println(men)
    println("''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''")
}

fun main() {
    println("¿Que edad cumple la persona?")
val edad = readLine()!!.toInt()
    println("¿Cuantas capas quieres que tenga la tarta?")
    val capas = readLine()!!.toInt()
    println("¿Que mensaje quieres poner junto a la tarta?")
    val mensaje= readLine().toString()
    println()
    println()
    println()
    imprimirMensaje(mensaje,edad)
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapasInf(edad, capas)

}