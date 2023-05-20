/*
    Write a Java program to print the results of the following operations. 
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
*/

class FollowingOperations {
    public static void main(String[] args) {
        int firstOps = -5+8*6;
        System.out.println("-5 + 8 * 6 = "+firstOps);
        int secondOps = (55+9) % 9;
        System.out.println("(55+9) % 9 = "+secondOps);
        int thirdOps = 20 + -3*5 / 8;
        System.out.println("20 + -3*5 / 8 = "+thirdOps);
        int fourthOps = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = "+fourthOps);
    }
}