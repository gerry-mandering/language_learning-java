package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");
        System.out.println(c.getName());

        Constructor<String>[] constructor = c.getConstructors();

        for (Constructor<String> stringConstructor : constructor) {
            System.out.println("stringConstructor = " + stringConstructor);
        }

        Method[] method = c.getMethods();

        for (Method method1 : method) {
            System.out.println("method1 = " + method1);
        }
    }
}
