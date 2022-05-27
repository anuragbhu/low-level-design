public class ObjectClass {
    public static void main(String[] args) {
        Hello hello = new Hello("Anurag");
        Hello hello1 = new Hello("Anurag");

        if(hello.equals(hello1))
            System.out.println("Yes");
        else
            System.out.println("No");

        String name = "Pandey";
        String name1 = "Pandey";
        if(name.equals(name1))
            System.out.println("Names are same");
        else
            System.out.println("Names are not same");
    }
}

class Hello {
    String name;

    public Hello(String name) {
        this.name = name;
    }
}