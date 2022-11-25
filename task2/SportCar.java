public class SportCar extends Car {
    int speedLimit;
    
    public SportCar(String brend, String classAuto, int weight, Driver driver, Engine engine, int speedLimit) {
        super(brend, classAuto, weight, driver, engine);
        this.speedLimit= speedLimit;
    }

}