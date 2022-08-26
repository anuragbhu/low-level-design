public class Singleton {

    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // Private constructor restricted to this class itself
    private Singleton() {
        System.out.println("Hello I'm the Singleton Class.");
    }

    // Static method to create instance of Singleton Class
    public static Singleton getInstance() {
        if(single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }

    public void print() {
        System.out.println("Printing from Singleton Class");
    }
}
