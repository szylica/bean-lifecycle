package org.szylica.beanlifecycle.event;

import org.springframework.context.ApplicationEvent;

public class CalculatorEvent extends ApplicationEvent {
    private Integer firstNumber;
    private Integer secondNumber;

    public CalculatorEvent(Object source, Integer firstNumber, Integer secondNumber) {
        super(source);
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

}
