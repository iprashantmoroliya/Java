/*
    Write a Java program to divide two numbers and print them on the screen. 
*/

import java.util.*;

class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====DIVIDE TWO NUMBERS=====");
        System.out.print("Enter First Number : ");
        int fnumber = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int snumber = scan.nextInt();
        int divide;
        try {
            if(snumber==0) {
                throw new ArithmeticException();
            } else {
                divide = fnumber/snumber;
                System.out.println(fnumber+"/"+snumber+"="+divide);
            }
        } catch(ArithmeticException ae) {
            System.out.println("\u001B[31mCan't divide by 0\u001B[0m");
            // These are ANSI Code for color in java console.
            throw ae;
        }
    }
}
