public class pet {
    String name;
    String animal;
    int age;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAnimal(String animal){
        this.animal = animal;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getAnimal(){
        return animal;
    }
    public int getAge(){
        return age;
    }

    public static void main (String[] args) {
        pet dog = new pet();

        dog.setName("Ricky");
        dog.setAnimal("Spaniel");
        dog.setAge(12);
        System.out.println(dog.getAnimal());
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
    }
}
