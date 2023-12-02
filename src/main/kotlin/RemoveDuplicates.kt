fun main(){
    val numbers = arrayOf(1, 2, 2, 3, 3, 3, 5)
    println(uniqueVals(numbers))
}

fun uniqueVals(array: Array<Int>): Int{
    if(array.isEmpty())
        return 0
    val n = array.size
    var cur = array[0]
    var result = 1
    for(i in 1..<n){
        if(array[i] != cur) {
            ++result
            cur = array[i]
        }
    }
    return result
}