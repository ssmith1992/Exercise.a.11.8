package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Write a method maxLength that accepts a set of strings as a parameter and that returns the length of the shortest
string in the list. If your method is passed an empty set, it should return 0.
 */
public class Exercise8 {
    public static void main(String[] args) {

    Set<String> list = new HashSet<>();
        list.add("hello");
        list.add("path");
        list.add("mighty");
        list.add("ninja");
        list.add("laptop");
        list.add("computer");
        list.add("basketball");

    Exercise8 exercise8 = new Exercise8();
    int maxLength = exercise8.maxLength(list);
        System.out.println(maxLength);

}

    public int maxLength(Set<String> listSet)
    {
        Iterator<String> itr = listSet.iterator();

        if (listSet.size() == 0) return 0;

        int current = itr.next().length();
        for (String word: listSet)
        {
            if (word.length() > current) current = word.length();
        }

        return current;
    }
}
