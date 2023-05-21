/*
    Write a Java program to convert a decimal number to a hexadecimal number. 
*/

import java.util.*;

class ConvertIntegerToHexadecimalMethodOne {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number;

        System.out.print("Enter decimal number: ");
        number=scan.nextInt();

        System.out.print(number+" in Hexadecimal = ");

        decimalToHexadecimal(number);

        System.out.println();
    }

    public static void decimalToHexadecimal(int number) {
        char[] hex={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int remainder;
        String hexNumber="";
        
        while(number>0) {
            remainder=number%16;
            hexNumber+=hex[remainder];
            number=number/16;
        }
        System.out.print(hexNumber);
    }
}