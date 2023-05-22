/*
    Write a Java program to convert a decimal number to an octal number.
*/

import java.util.*;
import java.io.*;

class ConvertDecimalToOctalNumberMethodOne {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====DECIMAL TO OCTAL CONVERSION=====");
        System.out.print("Enter number to which you want to convert in octal: ");
        int number=scan.nextInt();
        System.out.print(number+" in Octal system = "+Integer.toOctalString(number)+"\n");
    }
}
