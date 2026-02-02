package com.local;

import com.demo.methods.IPrimeNumbers;
import jakarta.ejb.Stateless;

/**
 *
 * @author m.dossa
 */
@Stateless
public class PrimeNumbers implements IPrimeNumbers {

    @Override
    public void getPrimeNums() {
        int n, number;
        String primeNumbers = "";
        for (n = 1; n <= 100; n++) {
            int primeCounter = 0;
            for (number = n; number >= 1; number--) {
                if (n % number == 0) {
                    primeCounter += 1;
                }
            }
            if (primeCounter == 2) {
                primeNumbers = primeNumbers + n + " ";
            }
        }

        System.out.printf("The prime numbers from 1 - 100 are:\n%s\n", primeNumbers);
    }

}
