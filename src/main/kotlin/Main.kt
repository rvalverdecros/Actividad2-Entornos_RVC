

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

fun imprimirMensaje(mensaje:String){
    println("''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''")
    println(mensaje)
    println("''-._.-''''-._.-''''-._.-''''-._.-''''-._.-''")
}

fun main() {
val edad = 30
    val capas = 5
    val mensaje= "¡¡¡¡MUCHAS FELICIDADES!!!!!"
    println()
    println()
    println()
    imprimirMensaje(mensaje)
    imprimirVelas(edad)
    imprimirCapaSup(edad)
    imprimirCapasInf(edad, capas)

}