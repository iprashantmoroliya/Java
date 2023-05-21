/*
    Java Program to Convert Integer Values into Binary
*/

import java.util.*;

class ConvertIntegerToBinaryMethodOne {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====CONVERT DECIMAL INTEGER TO BINARY=====");
        System.out.print("Enter number (in decimal): ");
        int number=scan.nextInt();
        System.out.print(number+" in binary = ");
        decimalToBinary(number);
    }
    public static void decimalToBinary(int number) {
        int[] binary=new int[20];
        int id=0;
        while(number>0) {
            binary[id++]=number%2;
            number=number/2;
        }
        printBinary(binary, id);
    }
    static void printBinary(int[] binary, int id) {
        for(int i=id-1; i>=0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}
