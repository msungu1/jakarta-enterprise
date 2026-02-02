package com.bank.ejb;

import jakarta.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author m.dossa
 */
@Stateless
public class AccountService {

    // Simulated In-memory database
    private final Map<String, Double> accounts = new HashMap<>();

    public AccountService() {
        // Initialize some demo accounts
        accounts.put("1001", 50000.0);
        accounts.put("1002", 45000.0);
        accounts.put("1003", 35000.0);
        accounts.put("1004", 25000.0);
        accounts.put("1005", 10000.0);
    }

    // Method to transfer the funds
    public void transferFunds(String fromAccount, String toAccount, Double amount) throws InsufficientFundsException {
        synchronized (this) {
            Double fromBalance = getAccountBalance(fromAccount);
            Double toBalance = getAccountBalance(toAccount);

            // Check whether the from account and the to account are fille in (not empty / null)
            if (fromBalance == null || toBalance == null) {
                throw new IllegalArgumentException("Account number not specified");
            }

            if (fromBalance < amount) {
                throw new InsufficientFundsException("Your account "
                        + fromAccount + " has insufficient funds."
                        + "\nAvailable balance: "
                        + fromBalance);
            }

            accounts.put(fromAccount, fromBalance - amount);
            accounts.put(toAccount, toBalance + amount);

        }
    }

    public Double getAccountBalance(String accountNumber) {
        // Method body
        if (!accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account not specified: " + accountNumber);
        }

        return accounts.get(accountNumber);
    }
}
