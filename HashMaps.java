import java.util.HashMap;

public class HashMaps {
    public static void main() {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        // adding to the hashmap
        examScores.put("Math", 75);
        examScores.put("Science", 85);
        examScores.put("english", 95);

        System.out.print(examScores.toString());

        // to get a specific value
        System.out.println(examScores.get("English")); // => 95

        // Below, math value will still be 75 if we print, cuz it doesn't overide
        examScores.putIfAbsent("Math", 70);

        // If we want to replace, we can do that too
        examScores.replace("math", 70);

        // If we want to get a key that doesn't exist, we will print out null
        System.out.println(examScores.get("Religion"));

        // We can return something else though if not there
        System.out.println(examScores.getOrDefault("Religion", -1));

        // Will check number of elements in the hash
        examScores.size();

        // removing an item
        examScores.remove("Math");

        // checking for existance
        examScores.containsKey("Math");

        // Or we can check values too, using reference also works, in hashmaps we can
        // pass primitives and it will automatically turn into reference types
        examScores.containsValue(100);
        examScores.containsValue(Integer.valueOf(100));

        // check if empty
        examScores.isEmpty();

        // When we have two variables in the forEach, we need (), but not for one
        examScores.forEach((key, value) -> {
            System.out.println(key + "-" + value);
        });

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
    }
}
