package docker.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void test () {
        String expected = "Hello World!!!";
        HelloWorld hello = new HelloWorld();
        assertEquals(expected, hello.showHello());
    }

}
