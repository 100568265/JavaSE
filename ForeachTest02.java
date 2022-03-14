package GenericLearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*集合使用增强for*/
public class ForeachTest02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        //添加元素
        strList.add("Hello！");
        strList.add("world！");
        strList.add("Watson！");

        //遍历，使用迭代器方式
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //使用下标方式
        for(int i =0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }

        //使用foreach
        for(String s: strList){//前面泛型规定为String类型
            System.out.println(s);
        }
    }
}
