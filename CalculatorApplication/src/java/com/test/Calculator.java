/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test;

import jakarta.ejb.Remote;

/**
 *
 * @author m.dossa
 */
@Remote
public interface Calculator {

    public String sayHello(String name);
    public int addition(int a, int b);

}
