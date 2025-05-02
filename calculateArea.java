import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);


        // Calculate area of a rectangle
        System.out.println("Calculate the area of a rectangle");
        System.out.print("Enter the width: ");
        width = sc.nextDouble();

        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm^2");


        sc.close();
    }
}
