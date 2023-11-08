/*Д/з Напишите метод, который добавляет 500000 элементов в ArrayList и LinkedList
и измерьте время, которое потрачено на это. Сравните результаты.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Object> arrayList = new ArrayList<>();
            List<Object> linkedList = new LinkedList<>();
            //System.out.println(addElements(linkedList) - addElements(arrayList));
        System.out.println(addElementLinkedList((LinkedList<Object>) linkedList) - addElemArrayList((ArrayList<Object>)arrayList));
        }

    public static long addElements(List<Object> list){
        long time = System.currentTimeMillis();
        for (int i=0; i<500_000; i++){
            list.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long addElemArrayList(ArrayList<Object> arrayList){
        long time = System.currentTimeMillis();
        for (int i=0; i<500_000; i++){
            arrayList.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long addElementLinkedList(LinkedList<Object> linkedList){
        long time = System.currentTimeMillis();
        for (int i=0; i<500_000; i++){
            linkedList.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }
}