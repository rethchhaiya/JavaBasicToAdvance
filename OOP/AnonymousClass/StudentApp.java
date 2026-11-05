package OOP.AnonymousClass;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student("Dara", 13),
            new Student("Solima", 19),
            new Student("Yaya", 18),
            new Student("Poy", 20),
            new Student("Ah", 21),
        };
        
        //anonymouse class
        Comparator<Student> sortByAge = new Comparator<Student>() {

            @Override
            public int compare(Student arg0, Student arg1) {
                //compare by name follow the alphabet
                // return arg1.getName().compareTo(arg0.getName()); 

                //compare by age
                return arg0.getAge() - arg1.getAge();
            }
            
        };

        //built in method for array
        Arrays.sort(students, sortByAge);

        for(Student st : students){
            System.out.println(st);
        }
    }
}
