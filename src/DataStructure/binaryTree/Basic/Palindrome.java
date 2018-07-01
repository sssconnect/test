package DataStructure.binaryTree.Basic;

import java.util.Scanner;

public class Palindrome {
    private boolean isPalindrome(String input){
        int j = input.length() - 1;
        int i = 0;
        while (i<j){
            if (input.charAt(i) != input.charAt(j)){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner scnStr = new Scanner(System.in);
        System.out.println("enter you input");
        Palindrome palindrome = new Palindrome();
        if (palindrome.isPalindrome(scnStr.next())){
            System.out.println("given Input is palindrom");
        }else {
            System.out.println("given Input is not palindrom");
        }
    }
}
