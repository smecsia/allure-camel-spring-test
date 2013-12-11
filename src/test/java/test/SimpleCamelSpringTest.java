package test;

import org.apache.camel.test.junit4.CamelSpringJUnit4ClassRunner;
import org.apache.camel.test.spring.MockEndpoints;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertTrue;

/**
 * @author: Ilya Sadykov (mailto: smecsia@yandex-team.ru)
 */
@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@DirtiesContext
@MockEndpoints("*")
public class SimpleCamelSpringTest {

    @Test
    public void test() {
        assertTrue(true);
    }
}
