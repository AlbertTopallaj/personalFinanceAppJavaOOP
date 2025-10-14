package filter;

import models.Transaction;
import java.util.List;

public class TransactionPrinter {

    public void print(List<Transaction> transactions) {
        if (transactions.isEmpty()) {
            System.out.println("Inga transaktioner hittades.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }
}
