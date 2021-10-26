package demo7;

public class Test {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b);
        b = new Book(5684, "双城记", 60, "查尔斯.狄更斯");
        System.out.println(b);
    }
}
