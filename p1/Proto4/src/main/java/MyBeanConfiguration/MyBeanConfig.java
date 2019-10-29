package MyBeanConfiguration;
import ADifferentService.MyOtherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import MyService.MyService;
import MyServiceImpl.MyServiceImpl;

@Configuration
public class MyBeanConfig {

    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }

    @Bean
    public MyOtherService myOtherService() {
        return new MyOtherService();
    }
}
