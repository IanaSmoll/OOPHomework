public class Driver extends Person{ // наследование
    String NameDriver;
    int DriveExperience;

    public Driver(String fullNAme, int age, String NameDriver, int DriveExperience) {
        super(fullNAme, age);
        this.NameDriver = NameDriver;
        this.DriveExperience = DriveExperience;
    }
}