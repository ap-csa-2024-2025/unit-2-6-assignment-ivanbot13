import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // prob 1:
    System.out.println("Radius: ");
    double radius = sc.nextDouble();
    Circle circle = new Circle(radius);
    double circum = circle.getCircumference();
    double area = circle.getArea();
    System.out.println("A circle with a radius of " + radius + " has a circumference of " + circum + " and an area of " + area);

    // prob 2:
    System.out.println("Number of sides: ");
    double sides = sc.nextDouble();
    System.out.println("Side length: ");
    double length = sc.nextDouble();
    RegularPolygon shape = new RegularPolygon(sides, length);
    area = shape.getArea();
    System.out.println("Area with " + sides + " sides: " + area);
    shape = shape.addSides(2); //error
    System.out.println("Incrementing the number of sides by two");
    area = shape.getArea();
    System.out.println("Area with " + (sides + 2) + " sides: " + area);
  }
}
