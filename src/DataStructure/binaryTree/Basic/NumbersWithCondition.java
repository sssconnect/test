package DataStructure.binaryTree.Basic;

import java.util.InputMismatchException;

public class NumbersWithCondition {
   public void printNumber(int lcm){
       for (int i = 1 ; i <= 100 ; i++){
           if (i % lcm == 0){
               System.out.println("Raja Software");
           }else if (i % 3 == 0){
               System.out.println("Raja");
           }else if (i % 5 == 0){
               System.out.println("Software");
           }else {
               System.out.println(i);
           }
       }
    }
    public int findLCM(int x, int y){
        int lcm = (x > y) ? x : y;
        while(true){
            if (lcm % x == 0 && lcm % y == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }
    public static void main(String[] args) {
        NumbersWithCondition numbersWithCondition = new NumbersWithCondition();
        numbersWithCondition.printNumber(numbersWithCondition.findLCM(3,5));

    }
}
