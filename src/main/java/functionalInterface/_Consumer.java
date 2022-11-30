package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        greetingCustomer(new Customer("Claudia", "3478"));

        Customer ela = new Customer("Elizabeth", "6543");
        greetCustomerConsumer2.accept(ela, false);

        Customer maria = new Customer("Maria", "1928");
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumer2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.customerName
                    + ", thanks for registering phone number: "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+ customer.customerName
                    + ", thanks for registering phone number: "
                    + customer.customerPhoneNumber);


    static void greetingCustomer (Customer customer) {
        System.out.println("Hello "+ customer.customerName+ ", thanks for registering phone number: "+ customer.customerPhoneNumber);
    }
    static void greetingCustomer2 (Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello "+ customer.customerName
                + ", thanks for registering phone number: "
                +(showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
