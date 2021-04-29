package Imperative;

import java.util.ArrayList;
import java.util.List;
import static  Imperative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Chetan", MALE),
                new Person("Radha", FEMALE),
                new Person("Geeta", FEMALE),
                new Person("Raghav", MALE)
        );

        List<Person> males = new ArrayList<>();

        for(Person person:people){
            if(MALE.equals(person.gender)){
                males.add(person);
            }
        }

        for(Person male: males){
            System.out.println(male);
        }
    }



    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
