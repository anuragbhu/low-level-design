public class ThisKeyword {
    int age;

    public ThisKeyword() {
        System.out.println("Inside the constructor");
    }

    public ThisKeyword(int age) {
        this();
        this.age = age;
        System.out.println(age);
    }

    void print() {
        System.out.println("Inside the print method");
    }

    void anotherPrint() {
        System.out.println("Inside the another print method");
        this.print();
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(12);
        thisKeyword.anotherPrint();
    }
}