public class Animal {
    String name;
    String food;
    String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
    public void makeNoise()
    {
        System.out.println("Какое-то животное говорит");
    }

    public void eat()
    {
        System.out.println("Какое-то животное ест");
    }

    public void sleep()
    {
        System.out.println("Какое-то животное спит");
    }
}