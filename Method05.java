//判断一个数是否为水仙花数
import java.util.Scanner;
public class Method05 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位的正整数: ");
        int num = input.nextInt();
        if(num<100||num>999){
            System.out.println("不是三位正整数");
            return;
        }
        int gw = num%10, sw = num/10%10, bw = num/100;
        int sum = gw * gw * gw + sw * sw * sw + bw * bw * bw;
        if(sum==num)
            System.out.println(num+"是水仙花数");
        else
            System.out.println(num+"不是水仙花数");







    }


}
