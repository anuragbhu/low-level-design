public class Honda extends Car{
    String country;

    public Honda(String country) {
        super("City", 2010);
        this.country = country;
    }

    @Override
    public void print() {
        System.out.println("In Honda Class!");
    }
}
