package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
            /*it extents from collection interface
            sets connot contain duplicate elements

            set interface implementation classes
                -HastSet
                -LinkedHashSet
                -EnumSet
                -TreeSet
            */

        // Set<String> set = new HashSet<>();

        // //add data
        // //if it contains duplicate data it only pick one and delete the other duplicate data
        // set.add("Apple");
        // set.add("Orange");
        // set.add("Mango");
        // set.add("Mango");

        // System.out.println(set);

        HashSet<String> hashSet = new HashSet<>();
        
        //add value
        hashSet.add("Test");
        hashSet.add("Test1");
        hashSet.add("Test2");
        hashSet.add("Test3");

        //add value from Set
        // hashSet.addAll(set);
        // System.out.println(hashSet);

        // //List value one by one
        // Iterator<String> iterator = hashSet.iterator();
        // while (iterator.hasNext()) {
        //     String a = iterator.next();
        //     System.out.println(a);
        // }
        
        //Intersection of Set
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        // set1.add(77);
        // set1.add(10);
        // set1.add(10);
        // set1.add(15);
        // set1.add(99);
        // set1.add(55);

        Set<Integer> set2 = new HashSet<>();
        set2.add(12);
        // set2.add(77);
        // set2.add(90);
        // set2.add(35);
        // set2.add(45);
        // set2.add(13);
        // set2.add(55);

        //check if these two object has a same value and show it
        // set1.retainAll(set2);
        
        // remove the duplicate data between set1 and set2
        // System.out.println(set1.removeAll(set2));

        //check if set1 has contain the exact same value as set2
        System.out.println(set1.containsAll(set2));

        // System.out.println(set1);


    }

}
