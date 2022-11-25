public class car {
    int year;
    String make;
    int speed;

public void setYear(int year) {
    this.year = year;
}  
public void setMake(String make) {
    this.make = make;
}  
public void setSpeed(int speed) {
    this.speed = speed;
} 
public int getYear(){
    return year;
}
public String getMake(){
    return make;
}
public int getSpeed(){
    return speed;
}

public static void main (String[] args) {
    car Passeger = new car();

    Passeger.setYear(2020);
    Passeger.setMake("Honda");
    Passeger.setSpeed(130);
    System.out.println(Passeger.getYear());
    System.out.println(Passeger.getMake());
    System.out.println(Passeger.getSpeed());

}
}
