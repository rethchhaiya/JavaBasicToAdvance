package Collections.Map.TreeMap.Practice;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Student {
    TreeMap<String, Double> students = new TreeMap<>();

    //add student method
    public void addStudent(String studentName, Double score){
        students.put(studentName, score);
    }

    //display student method
    public void displayStudent(){
        if(students.size() > 0){
            for(Map.Entry<String, Double> entry : students.entrySet()){
                System.out.println("Name: " + entry.getKey() + " , " + "Grade: " + entry.getValue());
            } 
        }else{
            System.out.println("There is no student yet");
        }
        
    }

    //delete student method
    public void removeStudent(String studentName){
        if(students.containsKey(studentName)){
            students.remove(studentName);
            System.out.println("Delete student successful");
        }    
        else{
            System.out.println("Student not found");
        }
    }

    //show top and button student
    public void findTopAndBottomStudent(){

        if(students.size() > 0){
            System.out.println("===========Top student===========");
            System.out.println(students.firstKey());
            System.out.println();
            System.out.println("===========Bottom Student==========");
            System.out.println(students.lastKey());
        }else{
            System.out.println("There is not student yet");
        }   
    }

    //find student between letter
    public void findStudentRange(String from, String to){
        SortedMap<String, Double> findStudentRange = students.subMap(from, to); 
        
        for(Map.Entry<String, Double> entry : findStudentRange.entrySet()){
            System.out.println("Name: " + entry.getKey() + " , " + "Grade: " + entry.getValue());
        }
        // System.out.println(findStudentRange.entrySet());
    }

    public double averageClass(){
        return students.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
