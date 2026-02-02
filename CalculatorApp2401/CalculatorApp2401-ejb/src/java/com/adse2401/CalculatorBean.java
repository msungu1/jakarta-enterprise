package com.adse2401;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

/**
 * CalculatorBean is a stateless session bean that implements CalculatorRemote.
 * 
 * Key exam notes:
 * - @Stateless → declares a stateless session bean.
 * - @Remote(CalculatorRemote.class) → exposes this bean via the CalculatorRemote interface.
 * - Implements ALL methods from CalculatorRemote (add, subtract, multiply, divide).
 */
@Stateless
@Remote(CalculatorRemote.class)
public class CalculatorBean implements CalculatorRemote {

    @Override
    public int addNumbers(int a, int b) {
        return a + b;
    }

    @Override
    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b; // integer division
    }
}
