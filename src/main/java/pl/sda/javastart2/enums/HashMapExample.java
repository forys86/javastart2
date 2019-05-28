package pl.sda.javastart2.enums;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        basicMapOperations();
    }

    private static void basicMapOperations() {

        Person ania = new Person(12, "Ania");
        Person ola = new Person(234, "Ola");
        Person tomek1 = new Person(345, "Tomek");
        Person tomek2 = new Person(456, "Tomek");

        Map<Integer, Person> peoplebyPesel = new HashMap<>();

        peoplebyPesel.put(ania.getPesel(), ania);
        peoplebyPesel.put(ola.getPesel(), ola);
        peoplebyPesel.put(tomek1.getPesel(), tomek1);
        peoplebyPesel.put(tomek2.getPesel(), tomek2);

        System.out.println(peoplebyPesel);

        Map<String, Person> peoplebyName = new HashMap<>();

        peoplebyName.put(ania.getName(), ania);
        peoplebyName.put(ola.getName(), ola);
        peoplebyName.put(tomek1.getName(), tomek1);
        peoplebyName.put(tomek2.getName(), tomek2);

        System.out.println(peoplebyName);
        properWayOfAddingPeople(ania, ola, tomek1, tomek2);

    }

    private static void properWayOfAddingPeople(Person ania, Person ola, Person tomek1, Person tomek2) {
        Map<String, List<Person>> peopleByNameProperWay = new HashMap<>();
        if (peopleByNameProperWay.containsKey(ania.getName())) {

        }
    }
}
