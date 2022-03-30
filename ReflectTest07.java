package ReflectLearn;

import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        /*不使用反射机制，怎么访问一个对象的属性？
        Student s = new Student();
        s.no=1111;
        System.out.println(s.no);*/

        //使用反射机制，怎么访问一个对象的属性
        /*虽然使用了反射机制，但是三要素还是缺一不可：
        * 要素1：obj对象
        * 要素2：no属性
        * 要素3:22222*/
        Class studentClass = Class.forName("ReflectLearn.Student");
        Object obj = studentClass.newInstance();//obj就是Student的对象
        Field noField = studentClass.getDeclaredField("no");
        noField.set(obj, 22222);//给对象的属性赋值
        //获取obj对象属性的值
        System.out.println(noField.get(obj));
        Field nameField = studentClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"jackson");
        System.out.println(nameField.get(obj));






    }
}
