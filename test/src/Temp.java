abstract class Bike {
    Bike() {
        System.out.println("Bike is created");
    }
}

class Hero extends Bike {
    void run() {
        System.out.println("Hero is running");
    }
}

public class Temp {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println(hero instanceof Bike);
        hero.run();
    }
}
