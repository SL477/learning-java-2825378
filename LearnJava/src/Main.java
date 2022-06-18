import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World! From the VSCode not quite an IDE");
        
        // primative types
        int studentAge = 15;
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

        input.close();
    }
}
