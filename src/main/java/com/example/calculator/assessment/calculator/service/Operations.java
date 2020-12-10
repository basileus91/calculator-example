package com.example.calculator.assessment.calculator.service;

import com.example.calculator.assessment.calculator.dto.Numbers;
import org.springframework.stereotype.Service;

/**
 * @author vasia
 * @created 10/12/2020 - 8:06 PM
 * @project assessment
 */
@Service
public class Operations implements OperationTypes {

    /**
     * @param numbers
     * @return sum a+b
     */
    @Override
    public Integer add(Numbers numbers) {
        return numbers.getFirstNumber()+numbers.getSecondNumber();
    }

    /**
     * @param numbers
     * @return sum a-b
     */
    @Override
    public Integer subtract(Numbers numbers) {
        return numbers.getFirstNumber() - numbers.getSecondNumber();
    }

    /**
     * @param numbers
     * @return sum a*b
     */
    @Override
    public Integer multiply(Numbers numbers) {
        return numbers.getFirstNumber() * numbers.getSecondNumber();
    }

    /**
     * @param numbers
     * @return sum a/b
     */
    @Override
    public Integer divide(Numbers numbers) {
        if (numbers.getSecondNumber() == 0) {
            return 0;
        } else {
            return numbers.getFirstNumber() / numbers.getSecondNumber();
        }
    }
}
