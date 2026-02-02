/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.ejb;

import jakarta.ejb.Stateless;

/**
 *
 * @author m.dossa
 */
@Stateless
public class ApplicationSession implements ApplicationSessionRemote {

    @Override
    public int add(int num1, int num2) {
        return 0;
    }
    
}
