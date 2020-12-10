package com.example.calculator.assessment.calculator.service;

import com.example.calculator.assessment.calculator.dto.Numbers;

/**
 * @author vasia
 * @created 10/12/2020 - 8:06 PM
 * @project assessment
 */
public interface OperationTypes {
    public Integer add(Numbers numbers);
    public Integer subtract(Numbers numbers);
    public Integer multiply(Numbers numbers);
    public Integer divide(Numbers numbers);
}
