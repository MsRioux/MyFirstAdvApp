public class Student
{
    //1 Instance Variables
    int StudentID;
    String name;
    double GPA;

    //2 Constructor
    public Student(int StudentId, String name, double GPA)
    {
        this.StudentID = StudentId;
        this.name = name;
        this.GPA = GPA;
    }

    //4 Getters / accessor

    public double getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    //5 Setters / mutators

    public void setName(String name) {
        this.name = name;
    }

    //6 Brain Methods

    //3 ToString

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
