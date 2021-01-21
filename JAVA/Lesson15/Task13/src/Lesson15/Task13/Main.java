package Lesson15.Task13;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Tom",20));
        person.add(new Person("Alice",45));
        person.add(new Person("Sam",30));
        person.add(new Person("Antony",15));
        person.add(new Person("Alice",21));
        person.add(new Person("Tom",5));

        System.out.println("~~~~~ До сортировки");
        Iterator<Person> i = person.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        Collections.sort(person, new PersonSuperComparator());

        System.out.println("~~~~~ После сортировки");
        Iterator<Person> j = person.iterator();
        while (j.hasNext())
            System.out.println(j.next());
    }
}

