package sombrero;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Configuration 애노테이션과 함께 implements WebMvcConfigurer 구현.
 *  => 스프링 부트가 제공하는 MVC 기능을 그대로 사용하면서 추가로 직접 기능을 확장해서 사용할 수 있음.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // registry.addMapping("/hello")
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:18080");
    }

}
