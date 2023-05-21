/*
    Write a Java program that takes user defined numbers as input to calculate and print the average of the numbers.
*/

import java.util.*;

class AverageOfInputNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====AVERAGE OF INPUT NUMBERS=====");
        System.out.println("How many number of input you want?");
        System.out.print("Number of Input: ");
        int numberOfInput=scan.nextInt();
        double num=0;
        
        // double i=1;
        // while(i<=numberOfInput) {
        //     System.out.print("Enter "+(int) i+" number: ");
        //     num+=scan.nextDouble();
        //     i++;
        // }

        for(int i=1; i<=numberOfInput; i++){
            System.out.print("Enter "+i+" number: ");
            num+=scan.nextDouble();
        }
        double averageOfNumbers=(num/numberOfInput);
        System.out.println("Average of "+numberOfInput+" numbers = "+averageOfNumbers);
    }
}
