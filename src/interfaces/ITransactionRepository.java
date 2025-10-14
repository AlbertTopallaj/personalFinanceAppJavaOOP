package interfaces;

import models.Transaction;

import java.util.List;

public interface ITransactionRepository {

    void save(Transaction transaction);
    void delete(int id);
    void update(Transaction transaction);
    List<Transaction> getAll();


}
