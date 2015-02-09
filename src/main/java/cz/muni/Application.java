package cz.muni;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public EPServiceProvider epServiceProvider() {
        return EPServiceProviderManager.getDefaultProvider();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
    }

}