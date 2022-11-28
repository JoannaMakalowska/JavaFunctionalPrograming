package imperative;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.FEMALE;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Aisha", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Marc", Gender.MALE),
                new Person("Chris", Gender.MALE)
        );
        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
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
        MALE, FEMALE
    }
}
