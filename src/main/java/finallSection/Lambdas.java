package finallSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String,String> upperCaseName = name -> name.toUpperCase();

        // logic
        BiFunction<String, Integer, String> upperCaseName2 = (name, age) -> {
            if (name.isBlank()) throw  new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName2.apply("Alex", 24));
    }

}
