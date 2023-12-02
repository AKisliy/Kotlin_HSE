import java.util.Random

fun main(){
    val input = readln()
    val n = input.toInt()
    val rnd = Random()
    val table: Array<Array<Int>> = Array(n) { Array(n) { 0 } }
    for (i in 0..<n){
        for(j in 0..<n){
            table[i][j] = rnd.nextInt(0,11)
        }
    }
    printArray(table)
    println(countSum(table, n))
}

fun printArray(arr: Array<Array<Int>>){
    for(row in arr){
        for(item in row){
            print(item)
            print(' ')
        }
        println()
    }
}

fun countSum(arr: Array<Array<Int>>, size: Int): Int{
    var i = size - 1
    var j = 1
    var result = 0
    while(j < size){
        val temp = j
        while(j < size){
            result += arr[i][j]
            ++j;
            --i;
        }
        j = temp + 1
        i = size - 1
    }
    return result
}