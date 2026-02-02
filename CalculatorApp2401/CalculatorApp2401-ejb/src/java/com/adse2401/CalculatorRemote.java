/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.adse2401;

import jakarta.ejb.Remote;

/**
 *
 * @author m.dossa
 */

@Remote
public interface CalculatorRemote {
    int addNumbers(int a, int b);
    int subtractNumbers (int a, int b);
    int multiply (int a, int b);
    int divide (int a, int b);
    
}