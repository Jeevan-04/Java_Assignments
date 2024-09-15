package Assignment3_1;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Constructors
        TreeMap<String, Integer> map1 = new TreeMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>(Map.of("A", 1, "B", 2));
        TreeMap<String, Integer> map3 = new TreeMap<>(map2);

        try {
            // 1. firstKey()
            System.out.println("First Key: " + map2.firstKey());

            // 2. headMap(K toKey)
            System.out.println("Head Map: " + map2.headMap("B"));

            // 3. lastKey()
            System.out.println("Last Key: " + map2.lastKey());

            // 4. subMap(K fromKey, K toKey)
            System.out.println("Sub Map: " + map2.subMap("A", "C"));

            // 5. tailMap(K fromKey)
            System.out.println("Tail Map: " + map2.tailMap("B"));

            // 6. ceilingEntry(K key)
            System.out.println("Ceiling Entry of 'B': " + map2.ceilingEntry("B"));

            // 7. ceilingKey(K key)
            System.out.println("Ceiling Key of 'B': " + map2.ceilingKey("B"));

            // 8. floorEntry(K key)
            System.out.println("Floor Entry of 'B': " + map2.floorEntry("B"));

            // 9. floorKey(K key)
            System.out.println("Floor Key of 'B': " + map2.floorKey("B"));

            // 10. higherEntry(K key)
            System.out.println("Higher Entry of 'B': " + map2.higherEntry("B"));

            // 11. navigableKeySet()
            System.out.println("Navigable Key Set: " + map2.navigableKeySet());

            // 12. pollFirstEntry()
            System.out.println("Poll First Entry: " + map2.pollFirstEntry());

            // 13. pollLastEntry()
            System.out.println("Poll Last Entry: " + map2.pollLastEntry());

            // 14. subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)
            System.out.println("Sub Map (inclusive): " + map2.subMap("A", true, "C", true));

            // 15. tailMap(K fromKey, boolean inclusive)
            System.out.println("Tail Map (inclusive): " + map2.tailMap("B", true));

            // 16. descendingKeySet()
            System.out.println("Descending Key Set: " + map2.descendingKeySet());

            // 17. descendingMap()
            System.out.println("Descending Map: " + map2.descendingMap());

            // 18. firstEntry()
            System.out.println("First Entry: " + map2.firstEntry());

            // 19. headMap(K toKey, boolean inclusive)
            System.out.println("Head Map (inclusive): " + map2.headMap("B", true));

            // 20. lastEntry()
            System.out.println("Last Entry: " + map2.lastEntry());
        } catch (NoSuchElementException e) {
            System.out.println("Error: The map is empty or the key does not exist.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid arguments provided.");
        }
    }
}
