///*
// * Implementation of the Calculator EJB
// * This is a stateless session bean that implements the CalculatorRemote interface.
// * 
// * Key exam notes:
// * - @Stateless → declares this as a stateless session bean.
// * - Implements CalculatorRemote → provides the actual calculator logic.
// * - Each method performs one basic arithmetic operation.
// */
//package com.adse2401;
//
//import jakarta.ejb.Stateless;
//
///**
// * cccccc implements CalculatorRemote.
// * Even though the name is unusual, it works as long as the class name
// * matches the file name.
// */
//@Stateless
//public class cccccc implements CalculatorRemote {
//
//    // Add two numbers
//    @Override
//    public int addNumbers(int a, int b) {
//        return a + b;
//    }
//
//    // Subtract second number from first
//
//    /**
//     *
//     * @param a
//     * @param b
//     * @return
//     */
//    @Override
//    public int subtractNumbers(int a, int b) {
//        return a - b;
//    }
//
//    // Multiply two numbers
//    @Override
//    public int multiplyNumbers(int a, int b) {
//        return a * b;
//    }
//
//    // Divide first number by second
//    @Override
//    public double divideNumbers(int a, int b) {
//        if (b == 0) {
//            throw new IllegalArgumentException("Division by zero is not allowed.");
//        }
//        return (double) a / b;
//    }
//}
