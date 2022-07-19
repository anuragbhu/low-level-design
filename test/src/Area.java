public abstract class Area {
    abstract double circle(int radius);

    abstract double square(int side);

    abstract double triangle(int base, int height);

    abstract double rectangle(int length, int breadth);

    public static void print() {
        System.out.println("In Abstract Class!");
    }
}
