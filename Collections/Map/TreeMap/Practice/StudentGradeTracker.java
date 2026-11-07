package Collections.Map.TreeMap.Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.addStudent("Aayy", 90.5);
        student.addStudent("Bea", 99.5);
        student.addStudent("Car", 91.5);
        student.addStudent("Diaa", 75.0);
        /*
            - add student + grade
            - remove a student
            - print all student
            - find top and bottom student
            - find student name rage
            - find class average
        */

        while (true) {
            System.out.println();
            System.out.println("+======================+");
            System.out.println("1. Add student");
            System.out.println("2. Show student");
            System.out.println("3. Remove student");
            System.out.println("4. Show top and bottom student");
            System.out.println("5. Find student rage");
            System.out.println("6. Find average class");
            System.out.println("7. Exit program");
            System.out.println("+======================+");
            System.out.print("Enter your chioce: ");
            int chioce = scanner.nextInt();
            scanner.nextLine();
            switch (chioce) {
                case 1:
                    System.out.println("+===========Add Student===========+");
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student Grade: ");
                    double score = scanner.nextDouble();

                    student.addStudent(name, score);
                    break;
                
                case 2:
                    System.out.println("+===========Show Student==========+");
                    student.displayStudent();
                    break;
            
                case 3:
                    System.out.println("+===========Remove Student=========+");
                    System.out.print("Enter student name: ");
                    String delName = scanner.nextLine();

                    student.removeStudent(delName);
                    break;

                case 4:
                    System.out.println("Show top and bottom student");
                    student.findTopAndBottomStudent();
                    break;
                
                case 5:
                    System.out.println("+============Find student range==========+");
                    System.out.print("Enter form letter: ");
                    String from = scanner.nextLine();
                    System.out.print("Enter to letter: ");
                    String to = scanner.nextLine();

                    student.findStudentRange(from, to);
                    break;
                
                case 6:
                    System.out.println("+===========Class Average=============+");
                    //format value
                    double value = student.averageClass();
                    // String formatValue = String.format("%.2f", value);
                    // System.out.println("Class average: " + formatValue);

                    //short way to format
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.println("Class average: " + df.format(value));
                    
                    break;
                
                case 7:
                    System.out.println("Program ended");
                    return ;

                default:
                    System.out.println("Invalid option please choose again");
                    break;
                
            }
            
        }
    }
}
