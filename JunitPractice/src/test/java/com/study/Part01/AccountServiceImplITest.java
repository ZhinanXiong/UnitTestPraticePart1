package com.study.Part01;

import com.study.common.IntergrationTest;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class AccountServiceImplITest {

    AccountServiceImpl accountService = new AccountServiceImpl();

    private Account account;

    public AccountServiceImplITest (Account account) {
        this.account = account;

    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("test class before??");
    }
    @Before
    public void before(){
        System.out.println("test case before??");
    }

    @Parameters
    public static  Account[] getAccount(){
        Account newAccount1 = new Account();
        newAccount1.setName("xiongzn001");
        newAccount1.setDescription("first test for junit.");

        Account newAccount2 = new Account();
        newAccount2.setName("xiongzn002");
        newAccount2.setDescription("sencond test for junit.");
        return new Account[]{newAccount1,newAccount2};
    }

    @Test
    /*
    @TestCaseName
    @Author
    @CreatedDate
     */
    public void testCreateNewAccount(){
//        Account newAccount = new Account();
//        newAccount.setName("xiongzn001");
//        newAccount.setDescription("first test for junit.");

        Account newAccountInserted = accountService.createNewAccount(account);

        assertThat(account,isA(Account.class));
        assertEquals(account.getName(),account.getName());
        assertEquals(account.getDescription(),account.description);
        System.out.println("new accout info is : "+account.name+","
                +account.description);
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
    @Category(IntergrationTest.class)
    public void testListAllTransactions(){
        Account account = new Account();
        account.setName("testListAllTransactions");

        accountService.listAllTransactions(account);
        assertTrue(accountService.listAllTransactions(account).size() > 1);



    }
    @After
    public void after(){
        System.out.println("test case after:");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("test class after??");
    }
}
