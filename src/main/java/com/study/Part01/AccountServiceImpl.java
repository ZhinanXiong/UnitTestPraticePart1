package com.study.Part01;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    public Account createNewAccount(Account account) {
        return account;
    }

    public Account updateAccount(Account account) {
        account.setName("tomas : new name");
        return account;
    }

    public boolean removeAccount(Account account) {
        return true;
    }

    public List listAllTransactions(Account account) {
        List listOfAllTransactions = new ArrayList();
        listOfAllTransactions.add(new Transaction());
        listOfAllTransactions.add(new Transaction());
        listOfAllTransactions.add(new Transaction());
        account.setTransactions(listOfAllTransactions);
        return listOfAllTransactions;
    }
}
