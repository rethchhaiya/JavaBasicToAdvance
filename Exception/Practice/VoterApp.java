package Exception.Practice;

import java.time.LocalDate;
import java.util.Scanner;

public class VoterApp {
    public static void main(String[] args) {
        Person person = new Person();

        Scanner scanner = new Scanner(System.in);
        VoterService voterService  = new VoterService();
        PersonService personService = new PersonService();

        String name = readLine("Enter name: ");
        String gender = readLine("Enter gender: ");
        System.out.println("Enter Date Of Birth: ");
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        scanner.nextLine();
        String idCart = readLine("Enter id card: ");
        String location = readLine("Enter location: ");
        String code = readLine("Enter code: ");

        person = personService.add(name, gender, LocalDate.of(year, month, day), idCart);
        voterService.register(person, location, code);
        voterService.displayVoter();

    }

    static final Scanner in = new Scanner(System.in);
    static String readLine(String prompt){
        System.out.println(prompt);
        return in.nextLine();   
    }
}
