public class Aspirant extends Student
{
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public double getScholarship() {
        if(averageMark == 5.0) {
            int scholarship = 200;
            return scholarship;
        }
        else {
            int scholarship = 180;
            return scholarship;
        }   
    }

    public static void main (String[] args) {
        Student student = new Student("Николай", "Елкин", "Group67", 4.5);
        Aspirant aspirant1 = new Aspirant("Семен", "Куличков", "Group76", 4.0, "Article");
        Student aspirant2 = new Aspirant("Юлия", "Корева", "Group98", 4.4, "Article1");

        Student[] students = {student, aspirant1, aspirant2};
        for(Student s: students) {
          System.out.println(s.getScholarship());  
        }
    }
}
    