package Collections.practice;


public class SchoolApp {
    public static void main(String[] args) {
        School school = new School();
        school.setName("Java School");

        Student st1 = new Student(1 ,18, "Reth Chhaiya", 'M');
        Student st2 = new Student(2 ,19, "Douen Solima", 'F');
        school.registerStudent(st1);
        school.registerStudent(st2);
        school.displayStudent();
        
        // System.out.println("==========After Remove============");
        // school.removeStudent(1);
        // school.displayStudent();

        System.out.println("========Search Student=============");
        Student studentFound = school.findByName("Reth Chhaiyaa");
        if(studentFound != null){
            System.out.println(studentFound);
        }
        else{
            System.out.println("Student Not found");
        }
        System.out.println("========Sort Student===========");

        school.sortByname();

        System.out.println("=========After update============");
        Student updateStudent = new Student(25, "Update Student", 'M');
        school.updateStudent(2, updateStudent);
        
    }
    
}
