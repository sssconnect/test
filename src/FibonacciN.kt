class FibonacciN1{
    fun series(cur:Int,prev:Int,size:Int){
        var cur = cur
        var prev = prev
        var series = size
        if (prev > size){
            return
        }else{
            print(prev)
            print(" ")
            var temp = prev;
            prev = cur + prev;
            cur = temp;
            series(cur,prev,series);
        }
    }
}
fun  main(args : Array<String>){
    var testCase = readLine()!!.toInt()
    var cur = 0
    var prev = 1
    var fiboObje = FibonacciN1()
    while (testCase-- > 0){
        val seriesSize = readLine()!!.toInt()
        print(cur)
        print(" ")
        fiboObje.series(cur,prev,seriesSize)
        println()
    }
}