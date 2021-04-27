package my_junit_homework_04_27;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.runAllTestsOfClass("my_junit.TestClass");
    }
}
