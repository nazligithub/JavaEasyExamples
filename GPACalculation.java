import java.util.Scanner;
public class GPACalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int physics, chemistry, biology, mathematichs;
        System.out.print("Physics grade:");
        physics = scanner.nextInt();
        System.out.print("Chemistry grade:");
        chemistry=scanner.nextInt();
        System.out.print("Biology grade:");
        biology=scanner.nextInt();
        System.out.print("Mathematichs grade:");
        mathematichs=scanner.nextInt();

        int conclusion=(physics+chemistry+biology+mathematichs)/4;
        System.out.println("GPA:"+conclusion);
    }
}
