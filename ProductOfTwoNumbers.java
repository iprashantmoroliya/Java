import java.util.*;

class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====PRODUCT OF TWO NUMBERS=====");
        System.out.print("Enter first number : ");
        int fnumber = scan.nextInt();
        System.out.print("Enter second number : ");
        int snumber = scan.nextInt();
        int product = fnumber*snumber;
        System.out.println(fnumber+"*"+snumber+"="+product);
    }
}
