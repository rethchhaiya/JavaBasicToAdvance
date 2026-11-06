package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> fruit = new HashMap<>();
        
        //set key and value 
        fruit.put("Apple", 10.5);
        fruit.put("Banana", 12.5);
        fruit.put("Orange", 9.50);
        fruit.put("Mango", 8.0);

        //get value using key
        System.out.println(fruit);

        
        //update value
        System.out.println("=======After update=========");
        fruit.put("Apple", 11.5);
        System.out.println(fruit);

        //check if apple is exsit or not
        // fruit.putIfAbsent("Apple", 12.5);

        //replace value
        // fruit.replace("Apple", 200.5);

        //replace using 3 parameter old value and new value
        fruit.replace("Apple", 11.5, 500.5);
        System.out.println(fruit);

        //remove
        fruit.remove("Apple");

        //ber value khos delet ot ban te
        //bug
        // fruit.remove("Apple", 1000.0);
        System.out.println(fruit);

        //show key only
        System.out.println(fruit.keySet());
        
        //show value only
        System.out.println(fruit.values());

        //show relationship
        System.out.println(fruit.entrySet());

        //loop through Map(key)
        for(String key : fruit.keySet()){
            System.out.println(key);
        }

        //loop through Map(Value)
        for(Double value : fruit.values()){
            System.out.println(value);
        }

        //loop through Map key and value
        for(Entry<String, Double> entry : fruit.entrySet()){
            //get key and value
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
