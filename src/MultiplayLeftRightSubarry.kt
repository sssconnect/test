class MultiplayLeftRightSubarry{
     fun leftRightArrayMulti(arr : IntArray, size : Int){
        var midIndex = (size-1)/2
        var leftSum = 0
        var rightSum = 0
        for (i in 0 until midIndex){
            leftSum += arr[i]
        }
        for (i in midIndex until  size){
            rightSum += arr[i]
        }
        println(leftSum * rightSum)
    }

}
fun main(args : Array<String>){
    var multiObj = MultiplayLeftRightSubarry()
    var testCase = readLine()!!.toInt()
    while (testCase --> 0){
        var arrSize = readLine()!!.toInt()
        var arr  = IntArray(arrSize)
        for (i in 0 until arrSize){
            arr[i] = readLine()!!.toInt()
        }
        multiObj.leftRightArrayMulti(arr,arrSize)
    }
}