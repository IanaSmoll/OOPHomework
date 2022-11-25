public class Person{ // создаем класс Person
    String fullNAme; // создаем переменные fullName и age в классе Person
    int age;

    public Person(String fullNAme, int age){ //  конструктор Person (String fullNAme, int age)
        this.fullNAme = fullNAme;
        this.age = age;
    }
    public Person(){// конструктор Person ()
        fullNAme = "Петр"; 
        age = 18;
    }

    public void move(){ // создаем методы move() и talk()
        System.out.println(fullNAme + "идет"); 
    }
    
    public void talk() {
        System.out.println(fullNAme + "говорит");
    }

    public static void main (String[] args) {
    Person person = new Person(); //создаем объект конструктором Person()
    Person person2 = new Person("Scot", 28); //создаем объект конструктором Person (String fullNAme, int age)
    }
}
