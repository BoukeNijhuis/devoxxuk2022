package devoxxuk2022;

public class HelloWorld {

    private static final String DEFAULT_VALUE = "World";

    public static void main(String[] args) {
        System.out.println(handleInput(args));
    }

    private static String handleInput(String[] inputArray) {
        String name = DEFAULT_VALUE;

        if (inputArray.length != 0) {
            name = inputArray[0];
        }

        return String.format("Hello %s!", name);
    }
}
