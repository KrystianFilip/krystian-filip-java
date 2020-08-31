package stream.iterate;

import java.util.stream.Stream;

public final class NumberGenerator {
    public static void generateEven(int max) {
        Stream.iterate(20, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Generating even numbers from 20 to 40: ");
        NumberGenerator.generateEven(21);
    }
}
