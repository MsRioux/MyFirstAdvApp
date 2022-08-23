public class CSStudent extends Student
{
    boolean isCSHSMember;

    public CSStudent (int StudentID, String name, double GPA)
    {
        super(StudentID, name, GPA);
        isCSHSMember = true;
    }

    @Override
    public String toString() {
        return "CSStudent{" +
                "isCSHSMember=" + isCSHSMember +
                '}';
    }
}
