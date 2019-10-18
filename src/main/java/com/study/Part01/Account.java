package com.study.Part01;

import java.util.List;

public class Account {

    String name;

    String description;

    List transactions;

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setTransactions(List<Transaction> transactions){
        this.transactions = transactions;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }
}
