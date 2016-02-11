package test;

import java.util.ArrayList;

public class PersonExample {
    public static void main(String[] args) {
        final ArrayList<Person> personsArray = new ArrayList<>();
        personsArray.add(new Person("John", "Doe", (byte) 20));
        personsArray.add(new Person("Debbie", "Smith", (byte) 30));
        personsArray.add(new Person("Chuck", "Norris", (byte) 20));

//        for (Person p: personsArray) {
//            System.out.println(p);
//        }

        personsArray
                .stream()
                .map(person -> person.getLastName())
                .forEach(lastName -> System.out.println(lastName));
    }
}
