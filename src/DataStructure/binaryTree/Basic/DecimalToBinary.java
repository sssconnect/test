package DataStructure.binaryTree.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinary {
    private void decToBinConversion(int input){
        int[] binary = new int[100000];
        int index = 0;
        while (input > 0){
            binary[index++] = input % 2;
            input = input/2;
        }
        for (int i = index-1 ; i >= 0 ; i--)
            System.out.print(binary[i]);
    }
    public static void main(String []args){
        Scanner scnInt = new Scanner(System.in);
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.println("Enter the number");
        try {
            decimalToBinary.decToBinConversion(scnInt.nextInt());
        } catch (InputMismatchException ime) {
            System.out.println("!Invaild number format, please enter integer numbers only");
        }
    }
}
