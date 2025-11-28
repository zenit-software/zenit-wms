package dev.zenit.wms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class H2ConsoleConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Macht /h2-console und /h2 erreichbar
        registry.addRedirectViewController("/h2-console", "/h2-console/");
        registry.addViewController("/h2-console/").setViewName("forward:/h2-console/index.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Wichtig: erlaubt Zugriff auf H2-Statik-Ressourcen
        registry.addResourceHandler("/h2-console/**")
                .addResourceLocations("classpath:/h2-console/");
    }
}