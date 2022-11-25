public class Student
{
    String firstName;
    String lastName;
    String group;
    double averageMark;
    
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student(){
    }

    public double getScholarship() {
        if(averageMark == 5) {
            int scholarship = 100;
            return scholarship;
        }
        else {
            int scholarship = 80;
            return scholarship;
        }
            
    }
}


    
