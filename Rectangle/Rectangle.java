import java.util.Scanner;

public class Rectangle
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        double length, width;
        System.out.print("What is the length: ");
        length = in.nextDouble();
        System.out.print("\nWhat is the width: ");
        width = in.nextDouble();
        double area = length*width;
        System.out.println("\nArea: " + area);
        double perimeter = (length*2)+(width*2);
        System.out.println("\nPerimeter: " + perimeter);
        double diagonal = Math.pow((Math.pow(length, 2)+Math.pow(width, 2)), 0.5);
        System.out.println("\nDiagonal: " + diagonal);
    }
}
