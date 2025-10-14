package repository;

import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public abstract class FileTransactionRepository implements ITransactionRepository {

    private final List<Transaction> transactions = new ArrayList<>();


    public void save(Transaction transaction) {
       transactions.add(transaction);
    }

    @Override
    public void load() {
        System.out.println("Load from file!");
    }

    @Override
    public void delete() {
        System.out.println("Delete file!");
    }

    @Override
    public void update() {
        System.out.println("Update file!");
    }
}
