import java.util.Scanner;
public class Method06 {
    //练习6：根据星期得到每天做的事情，加入星期1,2,4,6上课，星期3,5休息
    public static void main(String []args){
        System.out.println(judge());



    }
    public static String judge(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入日期：");
        String week = input.next();


        switch(week){
            case "星期一":
            case "星期二":
            case "星期四":
            case "星期五":
            case "星期六":
                return "上课";
            case "星期三":
            case "星期日":
                return "休息";
            default:
                return "不合法的输入";
        }


    }
}
