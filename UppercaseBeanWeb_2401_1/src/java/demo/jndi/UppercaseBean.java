/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.jndi;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 *
 * @author m.dossa
 */
@Stateless(mappedName = "Upper")
@LocalBean
public class UppercaseBean implements UppercaseRemote {

    @Override
    public StringBuffer sayHello() {
        String greeting = "hello jndi";
        StringBuffer updatesString = new StringBuffer(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            if (Character.isLowerCase((greeting.charAt(i)))) {
                updatesString.setCharAt(i, Character.toUpperCase(greeting.charAt(i)));
            }
        }
        // Display the converted string
        System.out.println("String: " + updatesString);
        return updatesString;
    }

}
