class PendulumArrangement1{
    public fun arrange(numbersArray: Array<Int>, arrSize:Int){
        numbersArray.sort()
        var index = (arrSize-1)/2;
        var j:Int = 1
        var k:Int = 1
        var arrangedArr = Array(arrSize,{i -> i * 2 })

        arrangedArr[index] = numbersArray[0]
        while (k <= index){
            arrangedArr[index+k] = numbersArray[j++]
            arrangedArr[index-k] = numbersArray[j++]
            k++
        }
        if (arrSize % 2 == 0){
            arrangedArr[index+k] = numbersArray[j]
        }

        for (l in 0 until arrSize){
            print(arrangedArr[l].toString() + " ")
        }
    }
}
fun main(args : Array<String>){
    var pendulumObj = PendulumArrangement1()
    var testCase = readLine()!!.toInt()
    while (testCase-- > 0){
        var arrSize = readLine()!!.toInt()
        val numbersArray = Array(arrSize, { i -> i * 2 })
        for ( i in 0 until arrSize){
            numbersArray.set(i, readLine()!!.toInt())
        }
        pendulumObj.arrange(numbersArray,arrSize)

    }

}