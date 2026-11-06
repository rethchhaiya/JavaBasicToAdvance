package Collections.ArrayList.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        return "School [name=" + name + ", student=" + students + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void registerStudent(Student student){
        students.add(student);
    }

    public void displayStudent(){
        for(Student student : students){
            // System.out.println("Name = " + student.getName() + " Age = " + student.getAge() + " Gender = " + student.getGender());
            System.out.println("Name = %s, Gender = %c , Age = %d".formatted(student.getName(), student.getGender(), student.getAge()));
        }
    }

    public void removeStudent(int studentId){
        // students.remove(student);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();

            if(student.getId() == studentId){
                iterator.remove();
            }
        }
    }

    public Student findByName(String name){
        for(Student st : students){
            if(st.getName().equals(name)){
                return st;
            }
        }
        return null;
    }

    public void sortByname(){
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override 
            public int compare(Student n1, Student n2){
                return n1.getName().compareTo(n2.getName());
            }
        };
        students.sort(comparator);
        displayStudent();
    }

    public Student findById(int studentId){
        for(Student student : students){
            if(student.getId() == studentId){
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int studentId, Student newstudent){
        Student student = findById(studentId);

        if(student != null){
            student.setName(newstudent.getName());
            student.setAge(newstudent.getAge());
            student.setGender(student.getGender());

            displayStudent();
        }
        else{
            System.out.println("Student not found");
        }
    }
    
}
