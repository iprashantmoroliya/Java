/*
    Write a Java program to add two binary numbers. 
*/

import java.util.*;
import java.io.*;

class AddTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        long firstNumber;
        long secondNumber;

        System.out.println("=====ADD TWO BINARY NUMBERS=====");
        System.out.println("In which system you want to put numbers in?");
        System.out.println("1. Decimal Number");
        System.out.println("2. Binary Number");
        System.out.print("Enter your choice: ");
        int choice=scan.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Decimal Number method selected.");
                System.out.print("Enter 1st number: ");
                firstNumber=scan.nextLong();
                String firstBinaryNumber=Long.toBinaryString(firstNumber);
                System.out.print("Enter 2nd number: ");
                secondNumber=scan.nextLong();
                String secondBinaryNumber=Long.toBinaryString(secondNumber);
                long addNumbers=firstNumber+secondNumber;
                String finalBinaryAddition=Long.toBinaryString(addNumbers);
                // long i=Long.parseLong(finalBinaryAddition);
                System.out.println(firstNumber+" in binary = "+firstBinaryNumber);
                System.out.println(secondNumber+" in binary = "+secondBinaryNumber);
                System.out.print(firstBinaryNumber+"+"+secondBinaryNumber+"="+finalBinaryAddition+"\n");
                break;

            case 2:
                System.out.println("Decimal Number method selected.");
                
                int i=0;
                int remainder=0;
                long newFirstNumber=0;
                long newSecondNumber=0;
                int[] sum=new int[20];

                System.out.print("Enter 1st number: ");
                firstNumber=scan.nextLong();
                System.out.print("Enter 2st number: ");
                secondNumber=scan.nextLong();

                newFirstNumber=firstNumber;
                newSecondNumber=secondNumber;

                while(newFirstNumber!=0 || newSecondNumber!=0) {
                    sum[i++] = (int)((newFirstNumber%10 + newSecondNumber%10 + remainder)%2);
                    remainder = (int)((newFirstNumber%10 + newSecondNumber%10 + remainder)/2);
                    newFirstNumber = newFirstNumber/10;
                    newSecondNumber = newSecondNumber/10;
                }
                
                if(remainder!=0) {
                    sum[i++] = remainder;
                }
                --i;
                System.out.print(firstNumber+"+"+secondNumber+"=");
                while(i>=0) {
                    System.out.print(sum[i--]);
                }
                System.out.println();
                break;
            
            default:
                System.out.println("Program terminated because you put wrong input...!!!");
                break;
        }
    }
}
