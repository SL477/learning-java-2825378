import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World! From the VSCode not quite an IDE");
        
        // primative types
        /*int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(hasPerfectAttendance);

        // strings, a reference type
        String studentFirstName = "Timmy";
        String studentLastName = "Fisher";
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        System.out.println("What do you want to update GPA to?");

        Scanner input = new Scanner(System.in);

        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);

        input.close();*/

        double num_hours = -1;
        double hourly_wage = 0;

        Scanner s = new Scanner(System.in);
        Boolean input = false;
        do {
            try {
                System.out.println("How many hours has the employee worked?");
                num_hours = s.nextDouble();
                input = false;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a number!");
                input = true;
                s.next();
            }
        } while (input);

        do {
            try {
                System.out.println("Hourly rate?");
                hourly_wage = s.nextDouble();
                input = false;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a number!");
                input = true;
                s.next();
            }
        } while (input);

        int holiday = 0;
        do {
            try {
                System.out.println("Number of holidays?");
                holiday = s.nextInt();
                input = false;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a number!");
                input = true;
                s.next();
            }
        } while (input);

        s.close();

        //System.out.println("Salary: " + ((hourly_wage * num_hours * 300) - (holiday * 8)));
        System.out.println("Salary: $" + salaryCalc(num_hours, hourly_wage, holiday));
    }

    public static double salaryCalc(double hoursPerWeek, double amtPerHour, int holiday) {
        if (hoursPerWeek < 0 || amtPerHour < 0 || holiday < 0) {
            return -1;
        }

        return (hoursPerWeek * amtPerHour * 52) - (holiday * 8);
    }
}
