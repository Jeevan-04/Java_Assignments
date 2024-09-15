package Assignment3_1;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        // Constructors
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(List.of("A", "B", "C"));
        ArrayList<String> list3 = new ArrayList<>(10);

        // Collection methods
        list1.add("Element1");
        list1.add("Element2");
        list1.addAll(List.of("Element3", "Element4"));
        list1.remove("Element2");
        list1.removeAll(List.of("Element3"));
        list1.clear();
        System.out.println("Contains Element1: " + list1.contains("Element1"));
        System.out.println("Contains all: " + list1.containsAll(List.of("Element1")));
        list1.addAll(List.of("Element1", "Element2"));
        list1.retainAll(List.of("Element1"));
        System.out.println("Is Empty: " + list1.isEmpty());
        System.out.println("Size: " + list1.size());

        // List methods
        list1.add(0, "NewElement");
        list1.add("Element3");
        list1.addAll(1, List.of("Element4", "Element5"));
        System.out.println("Get at index 1: " + list1.get(1));
        System.out.println("Index of Element4: " + list1.indexOf("Element4"));
        list1.add("Element4");
        System.out.println("Contains Element4: " + list1.contains("Element4"));
        list1.remove(2);
        list1.remove("Element4");
        list1.set(0, "UpdatedElement");
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("ListIterator next: " + listIterator.next());
        }
        System.out.println("SubList: " + list1.subList(0, 2));

        // Iteration
        System.out.println("For Loop:");
        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("For Each Loop:");
        list1.forEach(System.out::println);

        System.out.println("Iterator:");
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("ListIterator:");
        listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Create list using List.of(), List.copyOf(), List.asList()
        List<String> listOf = List.of("One", "Two", "Three");
        List<String> listCopyOf = List.copyOf(listOf);
        List<String> listAsList = List.of("Four", "Five", "Six");
    }
}
