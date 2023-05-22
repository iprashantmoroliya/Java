/*
    Write a Java program to convert a decimal number to a hexadecimal number. 
*/

import java.util.*;
import java.io.*;

class ConvertIntegerToHexadecimalMethodTwo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number;

        System.out.print("Enter decimal number: ");
        number=scan.nextInt();

        System.out.print(number+" in Hexadecimal = "+Integer.toHexString(number)+"\n");
    }
}
