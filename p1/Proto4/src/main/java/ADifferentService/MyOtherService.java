package ADifferentService;

import MyService.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyOtherService {
        @Autowired
        private MyService myService;
        @Bean
        public int useServiceByProxyAddFive(int x){
            return myService.addFive(x);
        }
}
