import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter Rate of Interest (per annum): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "% per annum");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
}
