/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package com.adse2401.sess02;

import jakarta.ejb.Local;

/**
 *
 * @author m.dossa
 */
@Local
public interface DemoExampleBeanLocal {

    int add(int firstNum, int secondNum);
    
}
