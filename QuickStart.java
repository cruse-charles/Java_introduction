import java.util.Scanner;
import java.util.Arrays;

class QuickStart {
    // static int age = 27; -> Can have our variable initialized outside of our
    // codeblock and still have access, but must be static, static method only works
    // with static vars

    // static int age; -> this will actually be automatically assigned if we define
    // in the class. For numbers, it is 0. So running our program will work. We can
    // redeclare inside the main method too
    public static void main(String[] args) {
        // Must initialize variabbles and declare what type they are, must have ; at the
        // end or there will be compiling issues
        // int age = 27;

        // age = 28;
        // System.out.println("I am " + age + " years old.");

        int numbers[] = { 1, 2, 3, 4, 5 };
        int copyOfNumbers[] = numbers;
        Arrays.fill(numbers, 0);

        int realCopy[] = Arrays.copyOf(numbers, numbers.length);
        // This is how we make a real copy, takes the array and the length, we can make
        // the array larger or smaller too which will fill more elements with 0, the
        // default value for integers. If we make it smaller, it just copies those first
        // X values

        System.out.println(numbers == realCopy);
        // This will reteurn as false now

        System.out.println(numbers);
        System.out.println(realCopy);

        numbers[0] = 100;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(realCopy));
        System.out.println(Arrays.equals(numbers, realCopy));
        // This will also return false
    }

}