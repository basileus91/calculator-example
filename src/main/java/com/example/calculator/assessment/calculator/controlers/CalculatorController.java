package com.example.calculator.assessment.calculator.controlers;

import com.example.calculator.assessment.calculator.dto.Numbers;
import com.example.calculator.assessment.calculator.service.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author vasia
 * @created 10/12/2020 - 8:00 PM
 * @project assessment
 */
@RestController
public class CalculatorController {

    @Autowired
    private Operations operations;

    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    ResponseEntity<Integer> sum(@RequestBody Numbers numbers) {
        return ResponseEntity.ok(this.operations.add(numbers));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/subtract")
    ResponseEntity<Integer> subtract(@RequestBody Numbers numbers) {
        return ResponseEntity.ok(this.operations.subtract(numbers));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/multiply")
    ResponseEntity<Integer> multiply(@RequestBody Numbers numbers) {
        return ResponseEntity.ok(this.operations.multiply(numbers));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/divide")
    ResponseEntity<Integer> divide(@RequestBody Numbers numbers) {
        return ResponseEntity.ok(this.operations.divide(numbers));
    }

}
