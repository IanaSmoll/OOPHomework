public class Veterinar {
    public static void treatAnimal(Animal animal) {
        System.out.println("Food - " + animal.food);
        System.out.println("Location - " + animal.location);
    }

    public static void main (String[] args) {
        Dog dog = new Dog("Dog", "meat", "Rehovot", "black");
        Cat cat = new Cat("Cat", "fish", "Tel-Aviv", 5);
        Horse horse = new Horse("Horse", "outmeal", "Tveria", 10);

        dog.makeNoise();
        cat.eat();
        horse.sleep();

        Veterinar.treatAnimal(dog);

        Animal[] animals = {dog, cat, horse};
        for(Animal a: animals){
        //for(int i = 0; i < animals.length; i++)
            System.out.println(a.name + " Отправляйтесь к ветеринару");
        }
    }
}