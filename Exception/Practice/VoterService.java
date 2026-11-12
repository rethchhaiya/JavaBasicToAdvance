package Exception.Practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class VoterService {
    private Set<Voter> voters = new HashSet<>();
    private static int count = 0;
    
    public Voter register(Person person, String location, String code){
        validate(person);

        Voter voter = new Voter();
        voter.setPerson(person);
        voter.setLocation(location);
        voter.setCode(code + count);
        count++;

        voters.add(voter);
        FileService.save(voter.toString());
        return voter;
    }

    public void displayVoter(){
        for(Voter voter : voters){
            System.out.println(voter);
        }
    }

    private void validate(Person person){
        if(person == null){
            throw new RuntimeException("Person cannot be null");
        }

        if(person.getIdCard() == null){
            throw new RuntimeException("User must have id card to vote");
        }

        //find time
        Period period = Period.between(person.getDob(), LocalDate.now());
        if(period.getYears() <= 18){
            throw new RuntimeException("Not enough age to vote");
        }   
    }

}
