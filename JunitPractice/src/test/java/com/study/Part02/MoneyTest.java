package com.study.Part02;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

    private static final Object getMoney(){
        return new Object[]{
                new Object[] {10, "USD"},
                new Object[] {20,"EUR"},
                new Object[] {30, "HK"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(
            Integer amount, String currency){
        Money money = new Money(amount,currency);
        assertEquals(amount,money.getAmount());
        assertEquals(currency,money.getCurrency());

    }
}
