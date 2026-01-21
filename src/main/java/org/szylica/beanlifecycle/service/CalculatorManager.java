package org.szylica.beanlifecycle.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.szylica.beanlifecycle.BeanMonitor;
import org.szylica.beanlifecycle.event.CalculatorEvent;

@Component
public class CalculatorManager implements ApplicationListener<CalculatorEvent> {

    private static final Logger log = LoggerFactory.getLogger(BeanMonitor.class);


    @Override
    public void onApplicationEvent(CalculatorEvent event) {
        log.info("Event received: {}", event);
        log.info("addition of " + event.getFirstNumber() + " and " + event.getSecondNumber() + " = " + (event.getFirstNumber() + event.getSecondNumber()));
        log.info("subtraction of " + event.getFirstNumber() + " and " + event.getSecondNumber() + " = " + (event.getFirstNumber() - event.getSecondNumber()));
        log.info("multiplication of " + event.getFirstNumber() + " and " + event.getSecondNumber() + " = " + (event.getFirstNumber() * event.getSecondNumber()));
        if(event.getSecondNumber() == 0){

            log.info("Division by zero is not possible");
        }
        else{

            log.info("division of " + event.getFirstNumber() + " and " + event.getSecondNumber() + " = " + (event.getFirstNumber() / event.getSecondNumber()));
        }
    }
}
