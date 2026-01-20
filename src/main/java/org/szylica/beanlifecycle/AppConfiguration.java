package org.szylica.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {
    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    @Scope("prototype")
    public BeanMonitor beanMonitor(){
        return new BeanMonitor();
    }
}
