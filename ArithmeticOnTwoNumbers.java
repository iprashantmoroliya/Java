/*
    Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
*/

import java.util.*;

class ArithmeticOnTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Arithmetic Operations On Two Numbers=====");
        System.out.print("Enter first number: ");
        int fnumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int snumber = scan.nextInt();
        int sum=fnumber+snumber;
        System.out.println(fnumber+"+"+snumber+"="+sum);
        int multiply=fnumber*snumber;
        System.out.println(fnumber+"*"+snumber+"="+multiply);
        int subtract=fnumber-snumber;
        System.out.println(fnumber+"-"+snumber+"="+subtract);
        int divide;
        try {
            if(snumber!=0) {
                divide = fnumber/snumber;
                System.out.println(fnumber+"/"+snumber+"="+divide);
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ae) {
            System.out.println("\u001B[31mCan't divide by 0\u001B[0m");
            throw ae;
        }
        int remainder = fnumber%snumber;
        System.out.println("Remainder of "+fnumber+" and "+snumber+" is = "+remainder);
    }
}