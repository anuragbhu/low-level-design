public class StaticKeyword {
    static int baseValue = 100;
    int n = 12;

    static {
        System.out.println("static block is invoked");
    }

    public static void main(String[] args) {
        System.out.println(baseValue);
        baseValue--;
        System.out.println(baseValue);

        StaticKeyword staticKeyword = new StaticKeyword();
        staticKeyword.print();
    }

    public void print(){
        System.out.println("Hello");
    }
}