package models;


import java.time.LocalDate;

public class Transaction {

    private static int nextID = 1;
    private int ID;
    private int amount;
    private String description;
    private LocalDate date;

    public Transaction(int ID, int amount, String description, String date){

        this.ID = nextID++;
        this.amount = amount;
        this.description = description;
        this.date = LocalDate.parse(date);

    }

    public int getID(){

        return ID;

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

        return "ID: " + ID + " " + description + " (" + amount + " kr, " + date + ")";

    }


}
