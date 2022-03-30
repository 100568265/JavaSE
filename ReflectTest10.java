package ReflectLearn;

import java.lang.reflect.Method;

public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //通过反射机制怎么调用一个对象的方法
        //不使用反射机制怎么调用方法
        UserService userService = new UserService();
        boolean loginSuccess = userService.login("admin", "123");
        System.out.println(loginSuccess?"登陆成功":"登录失败");
        //使用反射机制
        Class userServiceClass = Class.forName("ReflectLearn.UserService");
        Object obj = userServiceClass.newInstance();
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class,String.class);
        Object value = loginMethod.invoke(obj,"admin","123");
        System.out.println(value);


    }
}
