/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ke.co.adse240;

import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

/**
 *
 * @author m.dossa
 */
@Stateless
@Remote(CalculatorRemote.class)
public class CalculatorBean implements CalculatorRemote {

    @Override
    public int addNumbers(int a, int b) {
        return a + b;
    }
    
}
