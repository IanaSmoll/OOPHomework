public class Horse extends Animal {
    int amountRacing;
    public Horse(String name, String food, String location, int amountRacing) {
        super(name, food, location);
        this.amountRacing = amountRacing;
    }

    @Override
    public void makeNoise(){
        System.out.println("Лошадь говорит");
    }

    public void eat(){
        System.out.println("Лошадь ест");
    }
}
