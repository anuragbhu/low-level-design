class OuterClass {
    int x = 221;

    class InnerClass {
        int y = 323;
    }
}


public class Testing {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(outerClass.x + innerClass.y);
    }
}
