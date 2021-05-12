package OOP6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class Config {
    @Bean
    public point2d point2dA(){
        return new point2d(3,0);
    }

    @Bean
    public point2d point2dB(){
        return new point2d(0,0);
    }

    @Bean
    public point2d point2dC(){
        return new point2d(0,3);
    }

    @Bean
    public point2d point2dD(){
        return new point2d(1,1);
    }
    @Bean
    public triangle ABC(){
        return new triangle(point2dA(),point2dB(),point2dC());
    }
    @Bean
    public triangle ABD(){
        return new triangle(point2dA(),point2dB(),point2dD());
    }
    @Bean
    public triangle EFK(){
        return new triangle(ABC());
    }
}
