package com.study.Part01;

import java.util.List;

public interface AccountService {

    public Account createNewAccount(Account account);

    public Account updateAccount(Account account);

    public boolean removeAccount(Account account);

    public List listAllTransactions(Account account);
}
