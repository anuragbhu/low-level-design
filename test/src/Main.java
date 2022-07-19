public class Main {
    static int s = 12;
    public static void main(String[] args) {
        System.out.println(s);
        print();
        Car car = new Honda("India");
        car.print();
    }

    public static int sum(int a, double b) {
        return (int) (a + b);
    }

    public static int sum(double b, int a) {
        return (int) (a + b);
    }

    public static void print() {
        System.out.println("Hello");
    }
}