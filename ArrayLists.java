import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main() {
        // ArrayList is a way to create a dynamic array, can't change an array length
        // unless you copy with a new length or use an ArrayList

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // int, double, float, boolean are primitive types. But we can make them
        // reference using wrapper classes, like <Integer> being a reference type form
        // of int, and we have to use this wrapper class for ArrayLists, not primitive

        // must use add method for ArrayLists
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.toString());

        // We can print out a single value, but need the .get method, which takes an
        // index as an arg
        System.out.println(numbers.get(0));

        // Can remove by index
        numbers.remove(4);

        // And by value
        numbers.remove(Integer.valueOf(4));

        // removes all items
        numbers.clear();

        // update an item, using the index and replacemnt value
        // Because these are refernce type integers, we have to use Integer.valueOf
        numbers.set(2, Integer.valueOf(30));

        // To sort, takes a comparator as an argument
        // This is a method for the comparator class, to sort in natural order
        numbers.sort(Comparator.naturalOrder());

        // reverse sort
        numbers.sort(Comparator.reverseOrder());

        // size of an array
        numbers.size();

        // check if a value is in the array
        numbers.contains(Integer.valueOf(1));

        // check if the array is empty
        numbers.isEmpty();

        // loop through an array list and performing an action on each item
        // -> is a lambda expression, like a method with no name
        numbers.forEach(number -> {
            System.out.println(number * 2);
        });

        // To replace the array list
        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println("after: " + numbers.toString());

    }
}
