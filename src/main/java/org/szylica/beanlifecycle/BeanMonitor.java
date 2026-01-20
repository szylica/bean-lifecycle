package org.szylica.beanlifecycle;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanMonitor implements BeanPostProcessor {

    private static final Logger log = LoggerFactory.getLogger(BeanMonitor.class);

    @Override
    public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Bean name before init: " + beanName);
        return bean;
    }

    @Override
    public @Nullable Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Bean name after init: " + beanName);

        log.info("Bean created: " + beanName);
        return bean;
    }


}
