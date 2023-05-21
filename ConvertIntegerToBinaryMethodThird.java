/*
    Java Program to Convert Integer Values into Binary
    Using toBinaryString() inbuilt method of the Integer class of Java 
*/

import java.io.*;
import java.util.*;

class ConvertIntegerToBinaryMethodThird {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====CONVERT DECIMAL INTEGER TO BINARY=====");
        System.out.print("Enter number (in decimal): ");
        int number=scan.nextInt();
        String binaryNumber=Integer.toBinaryString(number);
        int i=Integer.parseInt(binaryNumber);
        System.out.print(number+" in binary = "+i+"\n");
    }
}
