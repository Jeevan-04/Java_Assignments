package Assignment3_1;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // Constructors
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>(List.of("A", "B", "C"));
        HashSet<String> set3 = new HashSet<>(10);
        HashSet<String> set4 = new HashSet<>(10, 0.75f);

        // 1. Convert HashSet to List/ArrayList
        ArrayList<String> listFromSet = new ArrayList<>(set1);

        // 2. Convert HashSet to TreeSet
        TreeSet<String> treeSetFromSet = new TreeSet<>(set1);

        // 3. Convert HashSet to array
        String[] arrayFromSet = set1.toArray(new String[0]);

        // 4. Test if HashSet is empty
        System.out.println("Is HashSet empty: " + set1.isEmpty());

        // 5. Empty a HashSet
        set1.clear();

        // 6. Get number of elements in HashSet
        System.out.println("Size: " + set1.size());

        // 7. Iterate through all elements
        System.out.println("Iterating through HashSet:");
        for (String s : set1) {
            System.out.println(s);
        }

        // 8. Add specified element
        set1.add("Element1");

        // 9. Remove specified element
        set1.remove("Element1");

        // 10. Try to add duplicate elements
        set1.add("Element2");
        set1.add("Element2");

        // 11. Add ArrayList elements to HashSet
        set1.addAll(List.of("Element3", "Element4"));

        // 12. Copy Set content to another HashSet
        HashSet<String> setCopy = new HashSet<>(set1);

        // 13. Create a HashSet with string items
        HashSet<String> stringSet = new HashSet<>(List.of("X", "Y", "Z"));

        // 14. Print HashSet using foreach loop
        System.out.println("HashSet elements:");
        stringSet.forEach(System.out::println);

        // 15. Check if HashSet contains a specified item
        System.out.println("Contains 'Y': " + stringSet.contains("Y"));

        // 16. Create HashSet with Box objects
        HashSet<Box> boxSet = new HashSet<>();
        boxSet.add(new Box(1, 2, 3));
        boxSet.add(new Box(4, 5, 6));

        // 17. Find union of HashSet collections
        HashSet<String> setA = new HashSet<>(List.of("A", "B", "C"));
        HashSet<String> setB = new HashSet<>(List.of("C", "D", "E"));
        setA.addAll(setB);
        System.out.println("Union: " + setA);

        // 18. Find intersection of HashSet collection
        HashSet<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // 19. Compare two sets and retain elements which are same
        HashSet<String> setC = new HashSet<>(List.of("B", "C"));
        setC.retainAll(setB);
        System.out.println("Retained elements: " + setC);

        // 20. Compare two HashSets
        System.out.println("Sets are equal: " + set1.equals(set2));

        // 21. Remove all elements from HashSet
        set1.clear();
    }
}

class Box {
    int length, height, width;

    Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Box{" + "length=" + length + ", height=" + height + ", width=" + width + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Box box = (Box) obj;
        return length == box.length && height == box.height && width == box.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height, width);
    }
}
