public class Main {

    public static void main(String[] args) {
        print();
        Employee employee = new Employee(20, 45);
    }

    public static void print() {
        System.out.println("Hello");
    }
}

class Employee {
    int age;
    int weight;

    public Employee(int age) {
        this(age, 0);
        System.out.println("Hello");
    }

    public Employee(int age, int weight) {
        System.out.println("Parameterized constructor called!");
        this.age = age;
        this.weight = weight;
        print(this);
    }

    public void print(Employee e) {
        System.out.println(e.age);
        System.out.println(e.weight);
        System.out.println("In Employee Class");
    }


}
