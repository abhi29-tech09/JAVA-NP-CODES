class Calculator1 {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();

        int sumTwoInts = calc.add(5, 10);
        double sumTwoDoubles = calc.add(5.5, 10.5);
        int sumThreeInts = calc.add(1, 2, 3);

        System.out.println("Sum of two integers: " + sumTwoInts);
        System.out.println("Sum of two doubles: " + sumTwoDoubles);
        System.out.println("Sum of three integers: " + sumThreeInts);
    }
}
