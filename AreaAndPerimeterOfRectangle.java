/*
    Write a Java program to print the area and perimeter of a rectangle. 
*/

import java.util.*;

class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("=====AREA & PERIMETER OF RECTANGLE=====");
        System.out.print("Enter length of Rectange: ");
        double lengthOfRectangle=scan.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadthOfRectangle=scan.nextDouble();

        double areaOfRectangle=lengthOfRectangle*breadthOfRectangle;
        double perimeterOfRectangle=2*(lengthOfRectangle+breadthOfRectangle);

        System.out.println("Area of Rectangle = "+areaOfRectangle);
        System.out.println("Perimeter of Rectangle = "+perimeterOfRectangle);
    }
}
