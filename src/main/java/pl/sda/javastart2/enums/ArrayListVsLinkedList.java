package pl.sda.javastart2.enums;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    private static List<Integer> arrayList = new ArrayList<Integer>();
    private static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        arrayListCompareToLinkedList();


    }

    private static void arrayListCompareToLinkedList() {
        int howManyTime = 100_000;
        addAtEnd(howManyTime, arrayList);
        addAtEnd(howManyTime, linkedList);
        addAtStart(howManyTime, linkedList);
        addAtStart(howManyTime, arrayList);
        addAllElementsUsedForeach(linkedList);
        arrayList.stream().mapToInt(e -> e).sum();
        linkedList.stream().mapToInt(e -> e).sum();


    }

    private static void addAtStart(int howManyTime, List<Integer> list) {
        long start = System.currentTimeMillis();//aktualny czas liczony w milisekundach od 1970r.
        for (int i = 0; i < howManyTime; i++) {
            list.add(0, 1);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Wykonanie ustawiania na koniec trwało :" + list.getClass().getSimpleName() + (finish - start) + "ms");

    }

    private static void addAtEnd(int howManyTime, List<Integer> arrayList) {

        long start = System.currentTimeMillis();//aktualny czas liczony w milisekundach od 1970r.
        for (int i = 0; i < howManyTime; i++) {
            arrayList.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Wykonanie ustawiania na koniec " + arrayList.getClass().getSimpleName() + " trwało :"

                + (finish - start) + "ms");

    }

    private static void addAllElements(List<Integer> list) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            //sum = sum+list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Wykonywanie sumowania po indeksie trwalo:" + list.getClass().getSimpleName() + ":" + (finish - start) + "ms");
    }

    private static void addAllElementsUsedForeach(List<Integer> list) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (Integer element : list) {
            sum = sum + element;
            //sum = sum+list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Wykonywanie sumowania po indeksie trwalo:" + list.getClass().getSimpleName() + ":" + (finish - start));


    }
}
