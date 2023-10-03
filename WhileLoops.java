public class WhileLoops {
    public static void main() {
        int number = 5;
        int multiplier = 1;

        while (multiplier <= 5) {
            System.out.printf("%d * %d \n", number, multiplier);
            multiplier++;
        }

        // Another way to do a while loop
        do {
            System.out.printf("%d * %d \n", number, multiplier);
            multiplier++;
        } while (multiplier <= 5);
    }
}
