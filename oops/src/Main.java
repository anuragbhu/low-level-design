public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OOPS concept!");
        // object instantiate
        Human chitti = new Human();
        System.out.println("Comes back from Constructor");
        chitti.age = 23;
        chitti.weight = 32;
        chitti.sleep();

        Human obj = new Human(22, 56);
        System.out.println("Age is " + obj.age);
        obj.eat();

        Human sample = new Human(obj);
        System.out.println("Age is " + sample.age);

        // Static data member
        System.out.println("Number of object created " + Human.count);

        Male alpha = new Male();
        alpha.sleep();

        Scorpio fav = new Scorpio();
        fav.intro();
        fav.breakCar();

        Dog goldy = new Dog();
        goldy.speak();
    }
}

class Human {
    // properties
    int age;
    int weight;
    // number of object created
    static int count = 0;

    // default constructor --- automatically created
    // two types
    // no-arg constructor
    public Human() {
        count++;
        age = 0;
        System.out.println("Inside the constructor - Creating Object");
    }
    // parameterized constructor
    public Human(int age, int weight) {
        this();
        count++;
        this.age = age;
        this.weight = weight;
    }

    // Copy Constructor
    public Human(Human human) {
        count++;
        this.age = human.age;
        this.weight = human.weight;
    }

    // behaviour
    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Male extends Human {

}

class Scorpio extends Mahindra {

}


class Mahindra extends Car {
    int rating;

    void intro() {
        System.out.println("This is Mahindra");
    }

    @Override
    void breakCar() {
        System.out.println("Mahindra car is breaking");
    }
}

class Car {
    String color;
    int weight;

    void runCar() {
        System.out.println("Car is running");
    }

    void runCar(int speed) {
        System.out.println("Car is running at speed " + speed);
    }

    void breakCar() {
        System.out.println("car is breaking");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof");
    }
}

class Animal {
    int age;
    int weight;

    void speak() {
        System.out.println("Haye");
    }
}