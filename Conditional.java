import java.util.Scanner;

public class Conditional {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(number1);
        System.out.println(number2);

        System.out.print("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else {
            System.out.printf("%s is not a supported operation.", operation);
        }

        scanner.close();
    }
}
