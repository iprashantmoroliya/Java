import java.util.*;

class SwapTwoVariablesWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====SWAP TWO VARIABLES WITHOUT USING THIRD VARIABLE=====");
        System.out.print("Enter 1st number: ");
        int firstNumber=scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNumber=scan.nextInt();
        System.out.println("Values before swapping are "+firstNumber+" and "+secondNumber);
        
        //logic to swap two numbers using 3rd variable;

        firstNumber = firstNumber+secondNumber;
        secondNumber = firstNumber-secondNumber;
        firstNumber = firstNumber-secondNumber;

        System.out.println("Values after swapping are "+firstNumber+" and "+secondNumber);
    }
}
