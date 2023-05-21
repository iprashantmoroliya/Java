/*
    Write a Java program to print the area and perimeter of a circle. 
*/

import java.util.*;
import java.lang.Math.*;

class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====AREA & PERIMETER OF CIRCLE=====");
        System.out.print("Enter Radius of Circle: ");
        double radiusOfCircle=scan.nextDouble();
        double areaOfCircle=Math.PI*Math.pow(radiusOfCircle, 2);
        double perimeterOfCircle=2*Math.PI*radiusOfCircle;
        System.out.println("Area of Circle: "+areaOfCircle+"\nPerimeter of Circle: "+perimeterOfCircle);
    }
}
