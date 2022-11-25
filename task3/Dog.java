public class Dog extends Animal {
    String color;
    public Dog(String name, String food, String location, String color) {
        super(name, food, location);
        this.color = color;
    }

    @Override
    public void makeNoise()
    {
        System.out.println("Собака говорит");
    }
    public void eat()
    {
        System.out.println("Собака ест");
    }

}