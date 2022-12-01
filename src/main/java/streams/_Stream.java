package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Aisha",FEMALE),
                new Person("Marc", MALE),
                new Person("Maria", FEMALE),
                new Person("Alex", MALE),
                new Person("Chris", MALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );
/*
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)  // mapToInt(name -> name.length())
                .forEach(System.out::println);  // .forEach(name -> System.out.println(name))
*/
        boolean containsOnlyFemale = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemale);
        // will return false

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);
        // will return true
    }

    static class Person {
        private final String name;
        private final Gender gender;


        Person (String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name = " + name + '\''+
                ", gender = " + gender +
                '}';
    }


}
enum Gender {
    MALE, FEMALE, PREFER_NOT_TO_SAY
}
}
