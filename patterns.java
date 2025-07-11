import java.util.Scanner;
abstract class patternPrinter{
     abstract void printPattern(int n);
}
class starPattern extends patternPrinter{
    @Override
    void printPattern(int n){
        System.out.println("Star pattern");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
class numberPattern extends patternPrinter{
    @Override
    void printPattern(int n){
        System.out.println("Number pattern");
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n =sc.nextInt();
        starPattern p1 = new starPattern();
        p1.printPattern(n);
        numberPattern n1 = new numberPattern();
        n1.printPattern(n);
        sc.close();
    }
}
