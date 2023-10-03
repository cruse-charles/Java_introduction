public class ForLoops {
    public static void main() {
        // Standard for loop
        for (int number = 0; number <= 10; number++) {
            System.out.println(number);
        }

        // standard way to loop through an array
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        // adding all numbers an array to a sum
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        System.out.println(sum);

        // We can also nest loops in java, but not doing an example of this

        // Example of if statements within for
        for (int num = 1; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // easier way to loop through an array
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
