import java.util.Scanner;
public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st edge:");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd edge:");
        int b = scanner.nextInt();

        double c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hypotenuse:" + (int) c);


    }
}