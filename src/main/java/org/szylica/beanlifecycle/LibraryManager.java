package org.szylica.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class LibraryManager implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String beanName;

    @Override
    public void setBeanName(String name) {
        beanName = name;
        System.out.println("Bean name: " + name);

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean class passed");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory passed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set");
    }

    @PostConstruct
    public void exampleConstructMethod(){
        System.out.println("Method annotated with @PostConstruct called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is being destroyed");
    }

    @PreDestroy
    public void exampleDestroyMethod(){
        System.out.println("Method annotated with @PreDestroy called");
    }


}
