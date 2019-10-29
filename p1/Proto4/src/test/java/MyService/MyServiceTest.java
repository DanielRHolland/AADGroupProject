package MyService;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import MyBeanConfiguration.MyBeanConfig;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Named;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader= AnnotationConfigContextLoader.class,
        classes= MyBeanConfig.class)
public class MyServiceTest {
    @Inject
    MyService myService;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addFiveShouldAddFive() {
        assertEquals(myService.addFive(3),8);
    }
}


