// PARENT CLASS || SUPER CLASS || BASE CLASS

public class Teacher {
    int numberOfStudents;
    String school;

    public Teacher(int numberOfStudents, String school) {
        this.numberOfStudents = numberOfStudents;
        this.school = school;
    }

    public String getRole() {
        return "This teacher teaches at " +
                this.school + " and has " +
                this.numberOfStudents + " students.";
    }

}