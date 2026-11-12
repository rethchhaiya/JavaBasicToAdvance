package Exception.Practice;

import java.time.LocalDate;

public class Person {
    private String id;
    private String name;
    private String gender;
    private LocalDate dob;
    private String idCard;

    // public Person(){}

    // public Person(String id, String name, String gender, LocalDate dob, String idCard) {
    //     this.id = id;
    //     this.name = name;
    //     this.gender = gender;
    //     this.dob = dob;
    //     this.idCard = idCard;
    // }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", idCard=" + idCard
                + "]";
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public LocalDate getDob() {
        return dob;
    }
    public String getIdCard() {
        return idCard;
    }
}
