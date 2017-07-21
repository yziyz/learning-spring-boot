package yz.learning.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*
        registry.addResourceHandler("/res/**")
                .addResourceLocations("file:/home/yuanzhen/download/");
        super.addResourceHandlers(registry);
        */
    }
}
