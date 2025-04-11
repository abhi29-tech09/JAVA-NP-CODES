import java.util.Scanner;

class Addition {
    int add(int a, int b) {
        return a + b;
    }
}

class Subtraction extends Addition {
    int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    int multiply(int a, int b) {
        return a * b;
    }
}

class Division extends Multiplication {
    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            return Double.NaN;
        }
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division calc = new Division();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        double divisionResult = calc.divide(num1, num2);
        if (Double.isNaN(divisionResult)) {
            System.out.println("Division: Error! Division by zero.");
        } else {
            System.out.println("Division: " + divisionResult);
        }

        scanner.close();
    }
}
