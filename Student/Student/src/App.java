
public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Timmy", "Fisher", 2022, 3.5, "Data Science");
        System.out.println(s1.FirstName);
        System.out.println(s1.incrementExpectedGraduationYear());

        Student s2 = new Student("Beth", "Fletcher", 2023, 3, "Law");

        System.out.println(s2.FirstName);
    }
}
