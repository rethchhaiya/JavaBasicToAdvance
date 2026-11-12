package Exception.Practice;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class PersonService {
    private final Map<String, Person> persons = new LinkedHashMap<>();

    public Person add(String name, String gender, LocalDate dob, String idCard){
        validate(name, gender, dob, idCard);

        if(findCardById(idCard) != null){
            throw new IllegalArgumentException("This card already register");
        }

        Person person = new Person();
        person.setId(UUID.randomUUID().toString());
        person.setName(name.trim());
        person.setGender(gender.toLowerCase());
        person.setDob(dob);
        person.setIdCard(idCard.trim());
        persons.put(person.getId(), person);

        return person;
    }

    public void read(){
        for(Person person : persons.values()){
            System.out.println(person);
        }
    }


    private void validate(String name, String gender, LocalDate dob, String idCard) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name is required.");
        if (gender == null || !List.of("male", "female", "other").contains(gender.toLowerCase()))
            throw new IllegalArgumentException("Gender must be male, female or other.");
        if (dob == null || dob.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Date of birth cannot be in the future.");
        if (idCard == null || idCard.isBlank())
            throw new IllegalArgumentException("idCard is required.");
    }

    public Person findCardById(String idCard){
        for(Person person : persons.values()){
            if(person.getIdCard().equals(idCard.trim())){
                return person;
            }
        }
        return null;
    }
}
