package Keyword;

public class StaticKeyword {
    public static void main(String[] args) {
        StudentStatic student = new StudentStatic("Yaya", "Male", 12);

        /*static key word mean it can access by class name or object name, there is no rule to access
        vaible or method that have static keyword*/

        //access static varible by class object
        // student.numberOfStudent = 20;

        //access static variable in static way
        StudentStatic.numberOfStudent = 20;

        // System.out.println(student);
        System.out.println(student.toString());
    }
}
