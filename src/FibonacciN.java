import java.util.Scanner;

public class FibonacciN {
    void series(int cur,int prev,int series){
        if (prev > series ){
            return;
        }
        else {
            System.out.print(prev+" ");
            int temp = prev;
            prev = cur + prev;
            cur = temp;
            series(cur,prev,series);
        }
    }
    public static void main(String args[]){
        FibonacciN fibo = new FibonacciN();
        Scanner scn  = new Scanner(System.in);
        int testCase = scn.nextInt();
        while (testCase-- > 0) {
            int series = scn.nextInt();
            int cur = 0,next = 1;
            System.out.print(cur+" ");
//            System.out.print(next);
            fibo.series(cur,next,series);
        }
    }
}
