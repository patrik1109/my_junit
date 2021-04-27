package my_junit_homework_04_27;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {
private final String testString ="test";
    @SneakyThrows
    public void runAllTestsOfClass(String className) {
        Class<?> aClass = Class.forName(className);
        //todo finish this by JUnit convension

        Method[] declaredMethods = aClass.getDeclaredMethods();

           for (Method method : declaredMethods) {
               if(method.getName().contains(testString)) {
                   TestClass testClass = (TestClass) aClass.getDeclaredConstructor().newInstance();
                   method.invoke(testClass);
               }
            }
    }
}
