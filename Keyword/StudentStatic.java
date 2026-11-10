package Keyword;

public class StudentStatic {

    private String name;
    private String gender;
    private int grade;

    //static mean every object of the class can access this variable or method 
    static int numberOfStudent;
    
    public StudentStatic(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", gender=" + gender + ", grade=" + grade +  ", number= " + numberOfStudent + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }
    
    //error
    // public static void print(){
    //     System.out.println(toString());
    // }

    //error 
    //because the variable name also need to be static 
    /*public static void print(){
        System.out.println("Name= " + name);
    }*/
}
