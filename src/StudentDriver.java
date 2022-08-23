public class StudentDriver
{
    public static void main(String[] args)
    {
        Student jin = new Student(165646, "Jin", 1.2);
        Student makayla = new Student(32165, "Makayla", 2.6);
        System.out.println(jin);
        System.out.println(makayla);
        CSStudent alexa = new CSStudent(46464, "Alexa", 3.0);
        System.out.println(alexa);

        //array (1d)
        Student[] classList = {jin, makayla, alexa};
        for (Student s: classList)
        {
            System.out.println(s);
        }

    }
}
