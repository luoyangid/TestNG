import org.testng.annotations.Test;

public class TestMain {
    @Test
    public void testName() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printWorld();
    }
}
