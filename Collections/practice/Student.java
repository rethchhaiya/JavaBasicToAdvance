package Collections.practice;

public class Student {
    private Integer id;
    private Integer age;
    private String name;
    private Character gender;
    
    public Student(Integer id ,Integer age, String name, Character gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public Student(Integer age, String name, Character gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", gender=" + gender + "]";
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Character getGender() {
        return gender;
    }

}
