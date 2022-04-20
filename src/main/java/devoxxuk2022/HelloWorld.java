package devoxxuk2022;

public class HelloWorld {

    private static final String DEFAULT_VALUE = "World";

    public static void main(String[] args) {
        System.out.println(createGreeting(args));
    }

    private static String createGreeting(String[] args) {
        String name = DEFAULT_VALUE;

        if (args.length != 0) {
            name = args[0];
        }

        return String.format("Hello %s!", name);
    }
}
