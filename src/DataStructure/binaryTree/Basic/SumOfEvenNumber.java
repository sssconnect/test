package DataStructure.binaryTree.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfEvenNumber {

   private int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scnInt = new Scanner(System.in);
        SumOfEvenNumber sumOfEvenNumber = new SumOfEvenNumber();

        System.out.println("Enter the Array Size");
        try {


            int size = scnInt.nextInt();

            // declares an Array of integers.
            int[] arr = new int[size];

            System.out.println("Enter the Array Element");
            for (int i = 0; i < size; i++) {
                arr[i] = scnInt.nextInt();
            }
            int sum = sumOfEvenNumber.sum(arr);
            if (sum == 0) {
                System.out.println("No even number present in given numbers");
            } else {
                System.out.println("Output:" + sum);
            }

        } catch (InputMismatchException ime) {
            System.out.println("!Invaild number format, please enter integer numbers only");
        }

    }
}
