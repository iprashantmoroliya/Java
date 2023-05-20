/*
    Write a Java program that takes a number as input and prints its multiplication table up to 10. 
*/

import java.util.*;

class TableMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====TABLE MULTIPLICATION=====");
        System.out.print("Enter number of which you want to print table of : ");
        int num = scan.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.print(num+" x "+i+" = "+(num*i));
            System.out.println();
        }
    }
}
