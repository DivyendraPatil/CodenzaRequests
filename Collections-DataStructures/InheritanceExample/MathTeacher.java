// CHILD CLASS // SUBCLASS // DERIVED CLASS

public class MathTeacher extends Teacher {
    int favoriteNumber;

    public MathTeacher(int numberOfStudents,
                       String school, int favoriteNumber) {
        // Calling the constructor of the super class
        // --> setting up the super class
        super(numberOfStudents, school);
        this.favoriteNumber = favoriteNumber;
    }
}
