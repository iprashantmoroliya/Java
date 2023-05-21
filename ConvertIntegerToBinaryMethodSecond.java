/*
    Java Program to Convert Integer Values into Binary
    Using Stack by creating Object Vector 
*/

import java.util.*;
import java.io.*;
import java.util.Stack.*;

class ConvertIntegerToBinaryMethodSecond {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====CONVERT DECIMAL INTEGER TO BINARY=====");
        System.out.print("Enter number (in decimal): ");
        int number=scan.nextInt();
        System.out.print(number+" in binary = ");
        decimalToBinary(number);
    }

    public static void decimalToBinary(int number) {
        Stack<Integer> st=new Stack<>(); // crating stack object vector;
        while(number>0) {
            st.push(number%2);
            number=number/2;
        }
        while(!(st.isEmpty())) {
            System.out.print(st.pop());
        }
        System.out.println();
    }
}
