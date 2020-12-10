package com.example.calculator.assessment.calculator;

import com.example.calculator.assessment.calculator.dto.Numbers;
import com.example.calculator.assessment.calculator.service.Operations;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @author vasia
 * @created 10/12/2020 - 8:26 PM
 * @project assessment
 */
@SpringBootTest(classes = Operations.class)
@AutoConfigureMockMvc
public class OperationsTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Operations operations;

    private Numbers numbers = new Numbers(10, 10);

    @Test
    void shouldReturnSumOfTwoNumbers() throws Exception{
        when(operations.add(this.numbers)).thenReturn(20);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/add"))
                .andReturn().getResponse().equals(20);
    }

    @Test
    void shouldReturnSubstractOfTwoNumbers() throws Exception{
        when(operations.add(this.numbers)).thenReturn(0);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/subtract"))
                .andReturn().getResponse().equals(0);
    }


    @Test
    void shouldReturnMultiplicationOfTwoNumbers() throws Exception{
        when(operations.add(this.numbers)).thenReturn(100);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/multiply"))
                .andReturn().getResponse().equals(100);
    }

    @Test
    void shouldReturnDivisionOfTwoNumbers() throws Exception{
        when(operations.add(this.numbers)).thenReturn(1);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/divide"))
                .andReturn().getResponse().equals(1);
    }

}
