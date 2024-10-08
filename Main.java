import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // prob 1:
    Scanner sc = new Scanner(System.in);
    System.out.println("Radius: ");
    double radius = sc.nextDouble();
    Circle circle = new Circle(radius);
    double circum = circle.getCircumference();
    double area = circle.getArea();
    System.out.println("A circle with a radius of " + radius + " has a circumference of " + circum + " and an area of " + area);

    // prob 2:

  }
}
