public class ShapeArea extends Area{

    public double circle(int radius) {
        return Math.PI * radius * radius;
    }

    public double square(int side) {
        return side * side;
    }

    public double triangle(int base, int height) {
        return 0.5 * base * height;
    }

    public double rectangle(int length, int breadth) {
        return length * breadth;
    }

    public void test() {
        System.out.println("Test");
    }
}
