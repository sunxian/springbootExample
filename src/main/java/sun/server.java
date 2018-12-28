package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @auther: SUNXIAN
 * @date: 2018-12-13
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class server {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(server.class, args);

    }
    /*@Bean
    public SecurityWebFilterChain securityWebFilterChain(
            ServerHttpSecurity http) {
        return http.authorizeExchange()
                .pathMatchers("/actuator/**").permitAll()
                .anyExchange().authenticated()
                .and().build();
    }*/

}
