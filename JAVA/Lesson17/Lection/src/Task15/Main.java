package Task15;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("foo");
        mySet.add("buzz");
        mySet.add("bar");
        mySet.add("fork");
        mySet.add("bort");
        mySet.add("spoon");
        mySet.add("!");
        mySet.add("dude");

        System.out.println(mySet);

        Set<String> newMySet;
        newMySet = removeEvenLength(mySet);

        System.out.println(newMySet);
    }

    public static Set<String> removeEvenLength(Set<String> set) {

        Set<String> temp = new HashSet<>();

        for (String entry : set) {
            if (entry.length()%2 != 0) {
                temp.add(entry);
            }
        }
        return temp;
    }
}
