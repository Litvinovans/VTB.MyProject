package Lesson15.Task13;

import java.util.Comparator;

class PersonSuperComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        int i = a.getName().compareTo(b.getName());
        if (i != 0) return i;
        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
