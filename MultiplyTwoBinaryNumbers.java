/*
    Write a Java program to multiply two binary numbers.
*/

import java.util.*;
import java.io.*;

class MultiplyTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        long firstNumber;
        long secondNumber;

        System.out.println("=====MULTIPLY TWO BINARY NUMBERS=====");
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
                long addNumbers=firstNumber*secondNumber;
                String finalBinaryAddition=Long.toBinaryString(addNumbers);
                // long i=Long.parseLong(finalBinaryAddition);
                System.out.println(firstNumber+" in binary = "+firstBinaryNumber);
                System.out.println(secondNumber+" in binary = "+secondBinaryNumber);
                System.out.print(firstBinaryNumber+" x "+secondBinaryNumber+"="+finalBinaryAddition+"\n");
                break;

            case 2:
                System.out.println("Decimal Number method selected.");
                
                long newFirstNumber;
                long newSecondNumber;
                long multiply=0;
                int digit;
                int factor=1;

                System.out.print("Enter 1st number: ");
                firstNumber=scan.nextLong();
                System.out.print("Enter 2nd number: ");
                secondNumber=scan.nextLong();

                newFirstNumber=firstNumber;
                newSecondNumber=secondNumber;

                while(newSecondNumber!=0) {
                    digit=(int)(newSecondNumber%10);
                    if(digit==1) {
                        newFirstNumber=newFirstNumber*factor;
                        multiply=binaryMultiply((int)newFirstNumber, (int) multiply);
                    } else {
                        newFirstNumber=newFirstNumber*factor;
                    }
                    newSecondNumber=newSecondNumber/10;
                    factor=10;
                }
                System.out.print(firstNumber+" x "+secondNumber+" = "+multiply+"\n");
                break;
            
            default:
                System.out.println("Program terminated because you put wrong input...!!!");
                break;
        }
    }

    static int binaryMultiply(int numberOne, int numberTwo) {
        int i=0;
        int remainder=0;
        int[] sum=new int[20];
        int binaryProdcutResult=0;

        while(numberOne!=0 || numberTwo!=0) {
            sum[i++] = (int)((numberOne%10 + numberTwo%10 + remainder)%2);
            remainder = (int)((numberOne%10 + numberTwo%10 + remainder)/2);
            numberOne = numberOne/10;
            numberTwo = numberTwo/10;
        }
                
        if(remainder!=0) {
            sum[i++] = remainder;
        }
        --i;
        while(i>=0) {
            binaryProdcutResult*=10;
            binaryProdcutResult+=sum[i--];
        }
        return binaryProdcutResult;
    }
}
