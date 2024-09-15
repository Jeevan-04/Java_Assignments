package Assignment3_1;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Constructors
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>(Set.of("A", "B", "C"));
        TreeSet<String> set3 = new TreeSet<>(Set.of("A", "B", "C"));

        // 1. ceiling(E obj)
        System.out.println("Ceiling of 'B': " + set2.ceiling("B"));

        // 2. descendingIterator()
        System.out.println("Descending Iterator:");
        set2.descendingIterator().forEachRemaining(System.out::println);

        // 3. descendingSet()
        NavigableSet<String> descendingSet = set2.descendingSet();
        System.out.println("Descending Set: " + descendingSet);

        // 4. floor(E obj)
        System.out.println("Floor of 'B': " + set2.floor("B"));

        // 5. headSet(E toElement, boolean inclusive)
        System.out.println("Head Set: " + set2.headSet("B", true));

        // 6. subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        System.out.println("Sub Set: " + set2.subSet("A", true, "C", true));

        // 7. higher(E obj)
        System.out.println("Higher than 'B': " + set2.higher("B"));

        // 8. lower(E obj)
        System.out.println("Lower than 'B': " + set2.lower("B"));

        // 9. pollFirst()
        System.out.println("Poll First: " + set2.pollFirst());

        // 10. pollLast()
        System.out.println("Poll Last: " + set2.pollLast());

        // 11. tailSet(E fromElement, boolean inclusive)
        System.out.println("Tail Set: " + set2.tailSet("B", true));
    }
}