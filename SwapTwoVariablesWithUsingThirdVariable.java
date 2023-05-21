import java.util.*;

class SwapTwoVariablesWithUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====SWAP TWO VARIABLES WITH USING THIRD VARIABLE=====");
        System.out.print("Enter 1st number: ");
        int firstNumber=scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNumber=scan.nextInt();
        System.out.println("Values before swapping are "+firstNumber+" and "+secondNumber);
        
        //logic to swap two numbers using 3rd variable;

        int tempNumber;

        tempNumber=firstNumber;
        firstNumber=secondNumber;
        secondNumber=tempNumber;

        System.out.println("Values after swapping are "+firstNumber+" and "+secondNumber);
    }
}
