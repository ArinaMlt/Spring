package SpringCourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("SpringCourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
