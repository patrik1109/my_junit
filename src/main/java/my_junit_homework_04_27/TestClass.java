package my_junit_homework_04_27;

/**
 * @author Evgeny Borisov
 */
public class TestClass {

    public TestClass(){
        this.before();
    }
    @RunBeforeEachTest
    public void before() {
        System.out.println("before test logic");
        //todo this method should be invoked before each test method

    }

    public void kaki() {
        System.out.println("kaki");
    }

    public void testMySomething() {
        System.out.println("I shoud work because my name starts from test");
    }

    public void test1() {
        System.out.println("11111111111111");
    }
}
