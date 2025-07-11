import java.util.Scanner;
interface Shape{
    void getperimeter();
    Scanner sc = new Scanner(System.in);
}
class Rectangle implements Shape{
    @Override
    public void getperimeter(){
    System.out.println("enter length");
    int a = sc.nextInt();
    System.out.println("enter breadth");
    int b = sc.nextInt();
    System.out.println("the perimeter of rectangle is :"+2*(a+b));
    }
}
class Circle implements Shape{
    @Override
    public void getperimeter(){
    System.out.println("enter radius");
    int a = sc.nextInt();
    System.out.println("the perimeter of circle is :"+2*Math.PI*a);
    }
}
class Triangle implements Shape{
    @Override
    public void getperimeter(){
    System.out.println("enter length of first edge");
    int a = sc.nextInt();
    System.out.println("enter length of second edge");
    int b = sc.nextInt();
    System.out.println("enter length of third edge");
    int c = sc.nextInt();
    System.out.println("the perimeter of triangle is :"+(a+b+c));
    }
}
public class rebbecaJohn{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        r1.getperimeter();
        c1.getperimeter();
        t1.getperimeter();
        Shape.sc.close();
    }
}
