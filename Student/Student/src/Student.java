public class Student {
    public String FirstName;
    public String LastName;
    public int ExpectedYearToGraduate;
    public double GPA;
    public String DeclaredMajor;

    public Student(String fname, String lname, int GraduationYear, double gpa, String major) {
        this.FirstName = fname;
        this.LastName = lname;
        this.ExpectedYearToGraduate = GraduationYear;
        this.GPA = gpa;
        this.DeclaredMajor = major;
    }

    public int incrementExpectedGraduationYear() {
        this.ExpectedYearToGraduate += 1;
        return this.ExpectedYearToGraduate;
    }
}
