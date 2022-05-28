public class MethodOverloading {
    void display() {
        System.out.println("Nothing to display");
    }

    void display(int a){
        System.out.println("Arguments: " + a);
    }

    void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
}
