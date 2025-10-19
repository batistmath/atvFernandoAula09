package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(num);
    }

    public double cubicRoot(double num) {
        return Math.cbrt(num);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public String toBinary(int num) {
        return Integer.toBinaryString(num);
    }


    public double powerOfTen(double exponent) {
        return Math.pow(10, exponent);
    }


    public long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public double getPi() {
        return Math.PI;
    }
}