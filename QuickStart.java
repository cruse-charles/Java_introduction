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
        int age = 27;

        age = 28;
        System.out.println("I am " + age + " years old.");

    }
}