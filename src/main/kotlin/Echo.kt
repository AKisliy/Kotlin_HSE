fun main(){
    val input = readln()
    val words = input.split(' ').toTypedArray()
    println(input)
    for(i in 1..3){
        println(words.last())
    }
}