/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.test;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author m.dossa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {

        InitialContext c = new InitialContext();
        Object l = c.lookup("caljndi");

        Calculator calc = (Calculator) l;
        System.out.println(calc.sayHello("Hasan"));
        System.out.println("5 + 2 = " + calc.addition(5, 2));
    }

}
