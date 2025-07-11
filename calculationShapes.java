import java.util.*;
abstract class shape3D{
    abstract void calculateSA(int a);
    abstract void calculateVolume(int a);
    Scanner sc = new Scanner(System.in);
}
class Sphere extends shape3D{
    @Override
    void calculateSA(int a){
        
    System.out.println("enter the radius of sphere :");
    a = sc.nextInt();
    System.out.println("the surface area of sphere is "+(4*Math.PI*a*a) );
    }
    @Override
    void calculateVolume(int a){
    System.out.println("enter the radius of sphere :");
    a = sc.nextInt();
    System.out.println("the volume of sphere is "+((4/3)*Math.PI*a*a*a) );
    }
}
class Cube extends shape3D{
    @Override
    void calculateSA(int a){
    System.out.println("enter the edge length of cube :");
    a = sc.nextInt();
    System.out.println("the surface area of cube is "+(6*a*a) );
    }
    @Override
    void calculateVolume(int a){
    System.out.println("enter the edge length of cube :");
    a = sc.nextInt();
    System.out.println("the volume of cube is "+(a*a*a));
    }
}
public class calculationShapes {
    static int a;
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        Cube c1 = new Cube();
        s1.calculateSA(a);
        s1.calculateVolume(a);
        System.out.println(" ");
        c1.calculateSA(a);
        c1.calculateVolume(a);
    }
}
