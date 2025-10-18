package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    // Subtração -> /api/calculator/subtract?num1=10&num2=5
    @GetMapping("/subtract")
    public double subtract(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.subtract(num1, num2);
    }

    // Multiplicação -> /api/calculator/multiply?num1=10&num2=5
    @GetMapping("/multiply")
    public double multiply(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.multiply(num1, num2);
    }

    // Divisão -> /api/calculator/divide?num1=10&num2=5
    @GetMapping("/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.divide(num1, num2);
    }

    // Raiz Quadrada -> /api/calculator/sqrt?num=9
    @GetMapping("/sqrt")
    public double squareRoot(@RequestParam double num) {
        return calculatorService.squareRoot(num);
    }

    // Raiz Cúbica -> /api/calculator/cbrt?num=8
    @GetMapping("/cbrt")
    public double cubicRoot(@RequestParam double num) {
        return calculatorService.cubicRoot(num);
    }

    // Potência -> /api/calculator/power?base=2&exponent=3
    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return calculatorService.power(base, exponent);
    }

    // Binário -> /api/calculator/binary?num=13
    @GetMapping("/binary")
    public String toBinary(@RequestParam int num) {
        return calculatorService.toBinary(num);
    }

    // Potência de 10 -> /api/calculator/pow10?exponent=3
    @GetMapping("/pow10")
    public double powerOfTen(@RequestParam double exponent) {
        return calculatorService.powerOfTen(exponent);
    }

    // Fatorial -> /api/calculator/factorial?num=5
    @GetMapping("/factorial")
    public long factorial(@RequestParam int num) {
        return calculatorService.factorial(num);
    }

    // PI -> /api/calculator/pi
    @GetMapping("/pi")
    public double getPi() {
        return calculatorService.getPi();
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}