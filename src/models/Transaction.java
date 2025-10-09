package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private int amount;
    private String description;
    LocalDate date;

    public Transaction(int amount, String description, LocalDate date){

        this.amount = amount;
        this.description = description;
        this.date = date;

    }

    public int getAmount(){

        return amount;

    }

    public String getDescription(){

        return description;

    }

    public LocalDate getDate(){

        return date;

    }

    public String toString(){

        return description + " (" + amount + " kr, " + date + ")";

    }


}
