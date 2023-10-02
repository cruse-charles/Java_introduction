import java.util.Scanner;

public class UserInputs {
    public static void main() {
        // scanner object is needed to get a user input, it is one of the classes, so we
        // can get a scanner object using new keyword. Scanner must be imported too

        Scanner scanner = new Scanner(System.in);

        // Just using print will stop us from going to next line right when printed, and
        // /n goes to next line
        System.out.print("Enter your name: ");
        // scanner.nextLine takes a string as iniput from user
        String name = scanner.nextLine();

        // printf is printing with a format
        System.out.printf("Hello %s. How old are you?", name);

        int age = scanner.nextInt();

        // Need to have another nextLine here as clean up. When using anything besides
        // nextLine, it just
        // takes in our number and not our <enter> button, so when we press enter, it
        // actually gets autmatically pushed to the nextLine statement, so if we are
        // supposed to put text in there, it will not put text and just pass right
        // through, so this extra nextLine is needed to account for that
        scanner.nextLine();

        // We could also do this below: to make our string into an integer and we
        // wouldn't need the cleanup like above
        // int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d is a great age!", age);

        // scanner.nextDouble and others all exist too
        // Need to close our scanner
        scanner.close();

    }
}
