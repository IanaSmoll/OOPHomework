public class Car {
    String brend;
    String classAuto;
    int weight;
    Driver driver; // создаем объект водитель типа Driver 
    Engine engine;

    public Car2(String brend, String classAuto, int weight, Driver driver, Engine engine) {
        this.brend = brend;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    
    /* 
    если мы будем инициацию делать в main
    public static void main (String[] args)
    Car2 car = new Car2("Honda", "classA", 150, new Driver("Петя", 5), new Engine(60, "Honda"))
    */

    public void  start(){
        System.out.println("Поехали");
    }
    public void  stop(){
        System.out.println("Останавливаемся");
    }
    public void  turnRight(){
        System.out.println("Поворот направо");
    }
    public void  turnLeft(){
        System.out.println("Поворот налево");
    }
    public String toString() {
        return("Марка автомобиля - " + brend + ", Класс автомобиля - " + classAuto + ", Вес автомобиля - " + weight + ", Водитель - " + driver + ", Мотор" + engine);
    }
}
