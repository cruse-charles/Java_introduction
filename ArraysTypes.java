import java.util.Arrays;

public class ArraysTypes {
    public static void main() {
        // Here we are putting length of the array
        char vowels[] = new char[5];

        // we are indexing into our array to put in the chars, starting at 0
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // vowels[5] = 'x'
        // This won't work, it does not have an index of 5 since we've set the length

        // Array must be converted to a string to print out, and so the import must be
        // done
        System.out.println(Arrays.toString(vowels));

        // We can do all above in one line actually
        char newVowels[] = { 'a', 'e', 'i', 'o', 'u' };

        // Can still replace values
        newVowels[2] = 'x';

        System.out.println(newVowels.length);
        // length was a method for strings, but for arrays it is a property

        Arrays.sort(newVowels);
        System.out.println(Arrays.toString(newVowels));
        // By default, this sorts the entire array but it can be performed within a
        // range too

        int startingIndex = 1;
        int endingIndex = 4;
        // Ending index is not inclusive when setting range
        Arrays.sort(newVowels, startingIndex, endingIndex);

        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(newVowels, key);
        // We can do a binary search to find something, but it must be sorted
        System.out.println(foundItemIndex);

        int foundItemRange = Arrays.binarySearch(newVowels, startingIndex, endingIndex, key);
        // This search can be done through a specific range as well like above

        // If we look for a key that is NOT in our array/range, it output a negative
        // number, however this negative number can vary for some reason

        Arrays.fill(newVowels, 'x');
        // Way to fill the entire array with a value

        Arrays.fill(newVowels, startingIndex, endingIndex, 'x');
        // Filling in a range in the array

        int numbers[] = { 1, 2, 3, 4, 5 };
        int copyOfNumbers[] = numbers;
        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        // Here, now BOTH arrays will be all 0, that is because arrays are reference
        // types, so assignment operators will not make a new copy but gets a new
        // variable and points to the original source

        System.out.println(numbers == copyOfNumbers);
        // This will actually return false.. not sure why even though they are identical
        // copies

        System.out.println(Arrays.equals(numbers, copyOfNumbers));
        // This will come out as true

        int realCopy[] = Arrays.copyOf(numbers, numbers.length);
        // This is how we make a real copy, takes the array and the length, we can make
        // the array larger or smaller too which will fill more elements with 0, the
        // default value for integers. If we make it smaller, it just copies those first
        // X values

        int realCopyRange[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);
        // This is how we copy a range within the array
        // Putting an ending index past the length of the original will also make the
        // new copy longer and filled with 0
    }
}
