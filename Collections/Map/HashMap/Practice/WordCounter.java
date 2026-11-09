package Collections.Map.HashMap.Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> counts = new HashMap<>();

        //use LinkedHashMap to ouput it in order
        // Map<String, Integer> counts = new LinkedHashMap<>();

        System.out.print("Enter any word: ");
        String text = scanner.nextLine();

        String[] words = text.toLowerCase().split("\\W+");

        for(String word : words){
            //if the word is emty just ignore it
            if(word.isEmpty()){
                continue;
            }
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : counts.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        scanner.close();
    }
}
