package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(3);
        System.out.println(increment2);

        int multiplyBy10Function = multiplyBy10.apply(3);
        System.out.println(multiplyBy10Function);

        Function<Integer, Integer> add1AndThanMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(add1AndThanMultiplyBy10.apply(6));

        // BiFunction

        System.out.println(incrementByOneAndMultiply(4, 100));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(7, 100));

    }
    static int incrementByOne(int number) {

        return number + 1;
    }
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numToIncrementByOne, numberToMultiplyBy ) ->
                    (numToIncrementByOne + 1) * numberToMultiplyBy;
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {

        return (number + 1) * numToMultiplyBy;
    }
    static Function<Integer,Integer> incrementByOneFunction =
            number2 -> number2 + 1;

    static Function<Integer, Integer> multiplyBy10 =
            number3 -> number3 * 10;




}
