import java.util.Scanner;

public class Switch {
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

        // For switch cases, it will go to ALL cases that count, so case and default and
        // maybe other cases, so to stop this we must break
        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.print("Cannot divide by 0");
                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.printf("%f is not a supported operation.", operation);
        }

        scanner.close();
    }
}
