import java.util.Scanner;

class Admission {
    void checkEligibility(double percentage) {
        System.out.println("Checking general eligibility.");
    }
}

class UGAdmission extends Admission {
    @Override
    void checkEligibility(double percentage) {
        if (percentage >= 60) {
            System.out.println("Eligible for UG program.");
        } else {
            System.out.println("Not eligible for UG program.");
        }
    }
}

class PGAdmission extends Admission {
    @Override
    void checkEligibility(double percentage) {
        if (percentage >= 70) {
            System.out.println("Eligible for PG program.");
        } else {
            System.out.println("Not eligible for PG program.");
        }
    }
}

public class admissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your percentage for UG admission: ");
        double ugPercentage = scanner.nextDouble();
        UGAdmission ug = new UGAdmission();
        ug.checkEligibility(ugPercentage);

        System.out.print("Enter your percentage for PG admission: ");
        double pgPercentage = scanner.nextDouble();
        PGAdmission pg = new PGAdmission();
        pg.checkEligibility(pgPercentage);

        scanner.close();
    }
}