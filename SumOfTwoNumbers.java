/*
 * Write a Java program to print the sum of two numbers. 
 */

import java.util.*;
 
class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====SUM OF TWO NUMBERS=====");
        System.out.print("Enter First Number : ");
        int fnumber = scan.nextInt();
        System.out.print("Enter Second Number " );
        int snumber = scan.nextInt();
        int sum = fnumber + snumber;
        System.out.println(fnumber+"+"+snumber+"="+sum);
    }
}