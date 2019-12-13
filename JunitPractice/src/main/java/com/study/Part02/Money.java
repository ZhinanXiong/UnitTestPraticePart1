package com.study.Part02;

public class Money {
    Integer amount;
    String currency;

    public Money(Integer amount,String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }
}
