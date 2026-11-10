package OOP.AnonymousClass;

public class Student {
    private int age;
    private String name;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // use this to ouput the data without this the data would be OOP.AnonymousClass.Student@251a69d7
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
