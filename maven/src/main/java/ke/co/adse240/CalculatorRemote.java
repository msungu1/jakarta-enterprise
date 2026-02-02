/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ke.co.adse240;
import jakarta.ejb.Remote;

/**
 *
 * @author m.dossa
 */
@Remote
public interface CalculatorRemote {
    int addNumbers(int a, int b);
}
