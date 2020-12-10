package com.example.calculator.assessment.calculator.dto;

import java.util.Objects;

/**
 * @author vasia
 * @created 10/12/2020 - 8:04 PM
 * @project assessment
 */
public class Numbers {
    Integer firstNumber;
    Integer secondNumber;

    public Numbers(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return firstNumber == numbers.firstNumber &&
                secondNumber == numbers.secondNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber);
    }
}
