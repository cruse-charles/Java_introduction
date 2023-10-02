public class Strings {
    public static void main() {
        // char is used for a single character, can't do two
        char percentSign = '%';

        // Can declare a string in two ways by using:
        // String name = 'Charles Neal Cruse';

        // Can also use 'new' keyword, creats new objects from classes
        String me = new String("Charles Neal Cruse");
        // Difference here is that if two strings have value, then just String = ...
        // will reference that same point in memeory. But with new, it'll create a new
        // object

        String literalString1 = "abc";
        String literalString2 = "abc";
        // Need double quotes for strings in Java

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);

        // ----------------------------------------------------------------
        String name = "Charles Charles";
        String country = "USA";
        int age = 30;

        // So we can print out like this listing out all vars, or another way
        // System.out.println("Hello, I'm " + name + ". I'm from " + country + " and I'm
        // " + age + " years old.");

        // Java compiler will know %s should be a string and %d should be an integer, %f
        // is for floating/double, and %c for char, and %b for boolean
        String formattedString = String.format("Hello, I'm %s. I am from %s. I am %d years old.", name, country, age);
        System.out.println(formattedString);

        // ------------------------------------------------------------------
        String nextName = "Charles Cruse";
        int stringLength = nextName.length();
        boolean empty = nextName.isEmpty();
        String upper = nextName.toUpperCase(); // => this does NOT change the original string
        String lower = nextName.toLowerCase();

        // If we want to just compare strings on a superficial sense, not looking at the
        // object
        boolean equalString = name.equals(nextName);
        boolean equalStringIgnore = name.equalsIgnoreCase(nextName); // => ignores casing

        String replaceLastName = nextName.replace("Cruse", "Cruz");
        // This does NOT change the original string actually

        boolean containsString = nextName.contains("Charles");
    }
}
