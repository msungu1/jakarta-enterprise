/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatefulEjbClass.java to edit this template
 */
package com.adse2401.sess02;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;

/**
 *
 * @author m.dossa
 */
@Stateful
@LocalBean
public class DemoExampleBean implements DemoExampleBeanLocal {
    
    // Method to add two integers and return their sum
    @Override
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
