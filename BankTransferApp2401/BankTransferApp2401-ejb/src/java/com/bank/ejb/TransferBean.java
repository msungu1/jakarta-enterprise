package com.bank.ejb;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

/**
 *
 * @author m.dossa
 */
@Stateless
public class TransferBean {

    @Inject
    private AccountService accountService;

    public void transferFunds(String fromAccount, String toAccount, double amount) throws InsufficientFundsException {
        accountService.transferFunds(fromAccount, toAccount, amount);
    }
    
    public double getAccountBalance(String accountNumber){
        return accountService.getAccountBalance(accountNumber);
    }
}
