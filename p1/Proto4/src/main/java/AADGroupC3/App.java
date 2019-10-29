package AADGroupC3;

import ADifferentService.MyOtherService;
import MyBeanConfiguration.MyBeanConfig;
import MyService.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);

    MyService myService = ctx.getBean(MyService.class);
    System.out.println(myService.addFive(7));

    MyOtherService myOtherService = ctx.getBean(MyOtherService.class);
    System.out.println(myOtherService.useServiceByProxyAddFive(3));
    }
}
