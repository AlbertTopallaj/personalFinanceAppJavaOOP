package models;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Transaction {

    private static int nextID = 1;
    private int ID;
    private int amount;
    private String description;
    private LocalDateTime date;
    private boolean isIncome;

    public Transaction(int ID, int amount, String description, String date, boolean isIncome){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.ID = nextID++;
        this.amount = amount;
        this.description = description;
        this.date = LocalDateTime.now();
        this.isIncome = isIncome;

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

    public LocalDateTime getDate(){

        return date;

    }

    public boolean isIncome() {

        return isIncome;

    }

    public String toString(){

        return (isIncome ? "[IN]" : "[OUT]") + " " + description + " - " + amount + " kr (" + date + ")";

    }


}
