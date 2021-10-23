package demo3;

public class Test {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x = "+ x +","+"y = "+y);//10 20
        change(x,y);
        System.out.println("x = "+ x +","+"y = "+y); // 10 20
    }

    private static void change(int x, int y) {
        x += 20;
        y += 20;
        System.out.println("x = "+ x +","+"y = "+y);// 30 40
    }
}
