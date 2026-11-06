package Collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListCollection {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        //add element
        nameList.add("Dara");
        nameList.add("Aaya");
        nameList.add("Baya");
        nameList.add("Caya");
        nameList.add("Daya");
        nameList.add("Ehida");

        System.out.println(nameList);

        // //access element by index
        // String name = nameList.get(1);
        // System.out.println(name);

        // //update element
        // // nameList.set(1, "mama");
        // System.out.println(nameList.get(1));

        // //remove element
        // // nameList.remove(1);
        // System.out.println(nameList);

        // //check size
        // System.out.println(nameList.size());

        //anonymouse class  
        Comparator<String> Alphabet = new Comparator<String>() {
            @Override 
            public int compare(String name1, String name2){
                return name2.compareTo(name1);
            }
        };

        nameList.sort(Alphabet);
        System.out.println(nameList);

        //search element
        System.out.println(nameList.contains("Aaa"));

        //check element is empty
        System.out.println(nameList.isEmpty());

        //find index of element
        System.out.println(nameList.indexOf("Dara"));

        //loop through one element at a time using for loop
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        //loop through one element at a time using foreach loop
        for(String name : nameList){
            System.out.print(name + " ");
        }
    }
}