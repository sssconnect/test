package DataStructure.binaryTree.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {

    void printTable(int tableNum){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(tableNum +" x "+ i +"  = " + i*tableNum);
        }
    }
    public static void main(String[] args) {

        Scanner scnInt = new Scanner(System.in);
        PrintTable printTable = new PrintTable();
        System.out.println("Enter the number");
        try {
            printTable.printTable(scnInt.nextInt());
        } catch (InputMismatchException ime) {
            System.out.println("!Invaild number format, please enter integer numbers only");
        }
    }
}
