package combinator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Asia",
                "asia@gmail.com",
                "+087964329",
                LocalDate.of(1994,3,5)
        );
        System.out.println(new CustomerValidatorService().isValid(customer));

    }
}
