package Assignment3_1;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // a) Insert Elements at the last position
        list.add("A");
        list.add("B");

        // b) Add elements at a specific position
        list.add(1, "C");
        list.addAll(2, List.of("D", "E"));

        // c) Retrieve the first item
        System.out.println("First Item: " + list.getFirst());

        // d) Retrieve the first occurrence of specified element
        System.out.println("First Occurrence of 'D': " + list.indexOf("D"));

        // e) Retrieve the position of the last occurrence of an element
        System.out.println("Last Occurrence of 'D': " + list.lastIndexOf("D"));

        // f) Retrieve but not remove the last element
        System.out.println("Last Element: " + list.getLast());

        // g) Get the number of elements
        System.out.println("Size: " + list.size());

        // h) Check if a particular element exists
        System.out.println("Contains 'B': " + list.contains("B"));

        // i) Find position of an element
        System.out.println("Position of 'E': " + list.indexOf("E"));

        // j) Iterate through all elements
        System.out.println("Iterating through all elements:");
        for (String s : list) {
            System.out.println(s);
        }

        // k) Iterate in reverse order
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println("Reverse: " + listIterator.previous());
        }

        // l) Display elements and their positions
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }

        // m) Check if list is empty
        System.out.println("Is Empty: " + list.isEmpty());

        // n) Replace an element
        list.set(1, "F");
        System.out.println("Replaced element at index 1: " + list.get(1));

        // o) Remove and return the first element
        System.out.println("Removed First Element: " + list.removeFirst());

        // p) Remove specified element
        list.remove("E");

        // q) Remove last element
        list.removeLast();

        // r) Remove all elements
        list.clear();

        // s) Pop items (stack behavior)
        list.push("G");
        list.push("H");
        System.out.println("Popped Item: " + list.pop());

        // t) Check if item exists
        System.out.println("Contains 'G': " + list.contains("G"));

        // u) Convert to ArrayList
        System.out.println("Convert to ArrayList:");
        System.out.println(new LinkedList<>(list));

        // v) Join two LinkedLists
        LinkedList<String> list2 = new LinkedList<>(List.of("I", "J"));
        list.addAll(list2);

        // w) Join ArrayList at the end
        list.addAll(new LinkedList<>(List.of("K", "L")));

        // x) Add LinkedList into another LinkedList at a specified index
        LinkedList<String> list3 = new LinkedList<>(List.of("M", "N"));
        list.addAll(1, list3);
    }
}
