package functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(3);
        System.out.println(increment2);

        int multiplyBy10Function = multiplyBy10.apply(3);
        System.out.println(multiplyBy10Function);

        Function<Integer, Integer> add1AndThanMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(add1AndThanMultiplyBy10.apply(6));
    }
    static int incrementByOne(int number) {
        return number + 1;
    }
    static Function<Integer,Integer> incrementByOneFunction =
            number2 -> number2 + 1;

    static Function<Integer, Integer> multiplyBy10 = number3 -> number3 * 10;


}
