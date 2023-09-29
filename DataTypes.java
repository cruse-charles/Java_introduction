class DataTypes {
    public static void main() {
        // We can't convert a decimal type to integer unless we explicitly state it like
        // below, where it will print as just 5
        // However, doing the reverse would work and it would print out 5.0
        double number1 = 5.8;
        int number2 = (int) number1;

        System.out.println(number2);

        number2 = 10;
        // Now with an int and double, the numbers can be multiplied or divided and we
        // will get a decimal data type, even if one is an int

        number2 += 10;
        // Numbers can refernce themsleves with this syntax

        // number2++ also increments

        // System.out.println(number++) => 10, it is read from left to right first, so
        // actually we print out 10 then increment, so if we put another print function
        // for number, then it will be 11

        // System.out.println(++number) => 11, this will actually work as we want, can
        // be put in beginning too of a var

        System.out.println(number1 == number2);
        // Java uses ==, != operators as well as the classic <,>,<=,>=

        System.out.println(number1 >= 18 && number1 <= 40);
        // Java uses && as their and operator and || as or operator, and ! for not

    }

}
