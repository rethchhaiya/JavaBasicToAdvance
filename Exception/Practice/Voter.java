package Exception.Practice;

public class Voter {
    private Long id;
    private String location;
    private Person person;
    private String code;
    
    public Long getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Voter [id=" + id + ", location=" + location + ", person=" + person + ", code=" + code + "]";
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}
