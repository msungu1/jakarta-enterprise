package com.local;
import com.demo.methods.IPrimeNumbers;
import jakarta.ejb.EJB;

/**
 *
 * @author m.dossa
 */
public class LocalClient {

    // Create an object with an implementation of IPrimeNumber inteface
    @EJB
    private static IPrimeNumbers prime = new PrimeNumbers();
    
    public static void main(String[] args) {
        prime.getPrimeNums();
    }
    
}
