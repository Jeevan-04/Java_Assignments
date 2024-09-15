package Assignment3_1;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Constructors
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>(Map.of("A", 1, "B", 2));
        HashMap<String, Integer> map3 = new HashMap<>(10);
        HashMap<String, Integer> map4 = new HashMap<>(10, 0.75f);

        // 1. get(Object key)
        System.out.println("Value for 'A': " + map1.get("A"));

        // 2. getOrDefault(Object key, V defaultValue)
        System.out.println("Value for 'C': " + map1.getOrDefault("C", 0));

        // 3. put(K key, V value)
        map1.put("A", 1);

        // 4. hashCode()
        System.out.println("HashCode: " + map1.hashCode());

        // 5. isEmpty()
        System.out.println("Is Empty: " + map1.isEmpty());

        // 6. containsKey(Object k)
        System.out.println("Contains Key 'A': " + map1.containsKey("A"));

        // 7. containsValue(Object v)
        System.out.println("Contains Value 1: " + map1.containsValue(1));

        // 8. remove(Object k)
        map1.remove("A");

        // 9. remove(Object key, Object value)
        map1.remove("A", 1);

        // 10. putIfAbsent(K key, V value)
        map1.putIfAbsent("B", 2);

        // 11. replace(K key, V value)
        map1.replace("B", 3);

        // 12. replace(K key, V oldValue, V newValue)
        map1.replace("B", 3, 4);

        // 13. clear()
        map1.clear();

        // 14. size()
        System.out.println("Size: " + map1.size());

        // 15. values()
        System.out.println("Values: " + map1.values());

        // 16. keySet()
        System.out.println("Key Set: " + map1.keySet());

        // 17. entrySet()
        System.out.println("Entry Set: " + map1.entrySet());

        // 18. getKey() of Map.Entry
        Map.Entry<String, Integer> entry = Map.entry("A", 1);
        System.out.println("Key: " + entry.getKey());

        // 19. getValue() of Map.Entry
        System.out.println("Value: " + entry.getValue());
    }
}
