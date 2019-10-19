package com.study.Part01;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertNotEquals;


public class AccountServiceImplITest {

    AccountServiceImpl accountService = new AccountServiceImpl();

    @Test
    /*
    @TestCaseName
    @Author
    @CreatedDate
     */
    public void testCreateNewAccount(){
        Account newAccount = new Account();
        newAccount.setName("xiongzn001");
        newAccount.setDescription("first test for junit.");

        Account newAccountInserted = accountService.createNewAccount(newAccount);

        assertThat(newAccount,isA(Account.class));
        assertEquals(newAccount.getName(),newAccountInserted.getName());
    }


    @Test
    public void testUpdateAccount(){
        Account oldAccount = new Account();
        oldAccount.setName("xiongzn002");
        oldAccount.setDescription("second test");

        String name = oldAccount.getName();
        Account expectAccountObj = new Account();
        expectAccountObj = accountService.updateAccount(oldAccount);

        assertThat(expectAccountObj,isA(Account.class));
        assertNotEquals(name,expectAccountObj.getName());
    }
    @Test
    public void testRemoveAccount(){
        Account toBeRemovedAccount = new Account();
        toBeRemovedAccount.setName("toBeRemoved");
        toBeRemovedAccount.setDescription("toBeRemoved account");

        assertTrue(accountService.removeAccount(toBeRemovedAccount));
    }

    @Test
    public void testListAllTransactions(){
        Account account = new Account();
        account.setName("testListAllTransactions");

        accountService.listAllTransactions(account);
        assertTrue(accountService.listAllTransactions(account).size() > 1);

    }
}
