class Shape {

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}

class Circle extends Shape {

    @Override
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        double squareArea = shape.calculateArea(5);
        double rectangleArea = shape.calculateArea(4, 6);
        double circleArea = circle.calculateArea(3);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
