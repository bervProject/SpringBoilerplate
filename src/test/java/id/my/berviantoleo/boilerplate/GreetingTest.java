package id.my.berviantoleo.boilerplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GreetingTest {
    @Autowired
    private GreetingController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void getHelloWorld() throws Exception {
        var output = controller.greeting(null);
        assertThat(output).isNotNull();
    }
}
