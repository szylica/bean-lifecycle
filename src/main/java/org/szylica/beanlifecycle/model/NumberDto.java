package org.szylica.beanlifecycle.model;

public class NumberDto {
    private Integer firstNumber;
    private Integer secondNumber;


    public NumberDto(Integer firstNumber, Integer secondNumber) {
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
