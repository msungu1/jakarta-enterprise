/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.test;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author m.dossa
 */
@Stateless
@LocalBean
public class CalculatorImplBean implements Calculator{

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", welcome to EJB!";
    }

    @Override
    public int addition(int a, int b) {
        return a +b;
    }
}
