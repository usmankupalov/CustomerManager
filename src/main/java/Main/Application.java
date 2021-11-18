package Main;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {


    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
}
