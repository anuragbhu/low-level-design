public class Creature {
    String name;
    void say() {
        System.out.println("I'm a creature.");
    }
}

class Fish extends Creature{
    String color;
    @Override
    void say() {
        System.out.println("I'm an aquatic creature");
    }
}
