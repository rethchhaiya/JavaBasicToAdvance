package Collections.Map.TreeMap;

import java.util.SortedMap;
import  java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        //TreeMap has a automatically sort the key base on alphabet(A-Z)
        TreeMap<String, Double> fruit = new TreeMap<>();

        //first key is not Banana it is Apple because of the alphabet
        fruit.put("Banana", 12.5);
        fruit.put("Orange", 9.50);
        fruit.put("Mango", 8.0);
        fruit.put("Zango", 8.0);
        fruit.put("Apple", 10.5);
        fruit.put("Npple", 10.5);
        //last key is not apple it is Zango because of the alphabet

        System.out.println(fruit);

        //get first key
        // System.out.println(fruit.firstKey());

        //get value using key
        // System.out.println(fruit.get("Apple"));

        //get all the value
        // System.out.println(fruit.values());

        //get last key 
        // System.out.println(fruit.lastKey());

        //change from {} => []
        // System.out.println(fruit.entrySet());

        //get the higher key from the input key 
        // System.out.println(fruit.higherKey("Apple")); //output is banana

        //get the lower key from the input key 
        // System.out.println(fruit.lowerKey("Banana")); //output is  apple
    
        //get the exact value if the key match
        // System.out.println(fruit.ceilingKey("Mango"));
        //get the higher key than itself but lower key to other key
        // System.out.println(fruit.ceilingKey("Mangoc"));

        //get the exact value if the key match
        // System.out.println(fruit.floorKey("Mango"));
        //get the lower key than itself but higher to other key
        // System.out.println(fruit.floorKey("Mango"));

        //get the higher key than itself but lower key to other key
        // System.out.println(fruit.higherEntry("Apple"));
        //get the lower key than itself but higher to other key
        // System.out.println(fruit.lowerEntry("Banana"));


        //poll the first key and delete it
        // System.out.println(fruit.pollFirstEntry());
        // System.out.println(fruit);

        //poll the last key and delete it
        // System.out.println(fruit.pollLastEntry());
        // System.out.println(fruit);

        //get all the lower key except itself
        // SortedMap<String, Double> sortedMap = fruit.headMap("Zango");

        //get all the lower key include itself
        // SortedMap<String, Double> sortedMap = fruit.headMap("Banana", true);

        //get all the higer key include inself
        // SortedMap<String, Double> sortedMap = fruit.tailMap("Banana");

        //get all the key between default key and specific key
        SortedMap<String, Double> sortedMap = fruit.subMap("Banana", "Orange");

        System.out.println(sortedMap);
    }
}
