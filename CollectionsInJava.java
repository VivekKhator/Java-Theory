import java.util.ArrayList;
import java.util.List;

public class CollectionsInJava{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //add an element in arraylist
        list.add(90);

        List<Integer> marks = new ArrayList<>();
        marks.add(23);
        marks.add(24);
        marks.add(54);
        marks.add(86);

        //add all the elements of a collection
        list.addAll(marks);
        System.out.println("Add marks collections in the existing collection: "+list);
        //get an element from collection using index
        System.out.println("element at index 0 : "+list.get(0)); 

        //get index of an element present in the collection
        System.out.println("Index of 23 : "+list.indexOf(23));

        //set an element at given position
        list.set(3, 99);
        System.out.println("set the element 99 at index 3: "+list);
        //remove an element from specified index in the collection
        list.remove(2);
        System.out.println("remove the element present at index 2: " +list);

        //remove a specified element in the collection
        list.remove(Integer.valueOf(86));
        System.out.println("remove 86 from list: "+list);

        //check if specific element is present in the collection or not
        System.out.println("if list contains 34: "+list.contains(34));

    }
}