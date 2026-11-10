package Keyword;

class Person{
    String name = "Yaya";
    int age = 10;
    String gender = "Male";

    Person(){
        System.out.println("This is parent constructor");
    }

    void message(){
        System.out.println("This message is from parent class");
    }
}
/*
 use super keyword when 
    - when subclass(child class) and superclass(Parent class) having the same variable or method name
    - use to call parent class constructor work with both parameter and non-parameter
*/ 
class Student extends Person{

    String name = "Mama";

    Student(){
        super();
        System.out.println("This is child constructor");
    }

    void message(){
        System.out.println("This message is from child class");
    }

    void diplay(){
        // System.out.println("Child name: " + this.name);

        // System.out.println("Parent name: " + super.name);
        // System.out.println("Parent age: " + super.age);
        // System.out.println("Parent gender: " + gender);

        // message();

        //call method from parent class
        // super.message();
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        Student student = new Student();
        student.diplay();
    }
}
