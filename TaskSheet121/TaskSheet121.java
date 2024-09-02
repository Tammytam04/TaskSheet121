import static java.lang.Math.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskSheet121 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

  
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

   
    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            
            System.out.println("Sum:"+ add(a, b));
            System.out.println("Difference:"+ subtract(a, b));
            System.out.println("Product:" + multiply(a, b));
            System.out.println("Quotient:"+ divide(a, b));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } finally {
            
            scanner.close();
        }
    }
}
