package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther: SUNXIAN
 * @date: 2018-12-13
 */
@SpringBootApplication
@EnableAutoConfiguration
public class server {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(server.class, args);
    }
}
