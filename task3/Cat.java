public class Cat extends Animal {
    int age;
    public Cat(String name, String food, String location, int age) {
        super(name, food, location);
        this.age = age;
    }

    @Override
    public void makeNoise()
    {
        System.out.println("Кошка говорит");
    }
    public void eat()
    {
        System.out.println("Кошка ест");
    }
}