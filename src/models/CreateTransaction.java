package models;

import commands.CreateTransactionCommand;

public class CreateTransaction {

    private int amount;
    private String description;

    public CreateTransaction(){

        this.amount = amount;
        this.description = description;

    }

    public int getAmount(){

        return amount;

    }

    public String getDescription(){

        return description;

    }

    public void setAmount(int amount){

        this.amount = amount;

    }

    public void setDescription(String description){

        this.description = description;

    }

}
