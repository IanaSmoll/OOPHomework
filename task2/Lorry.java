public class Lorry extends Car {
    int loadCapacity;
    
    public Lorry(String brend, String classAuto, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(brend, classAuto, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

}