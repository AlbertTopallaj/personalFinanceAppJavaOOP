package filter;

import models.Transaction;

import java.util.List;

public interface ITransactionFilter {

   List<Transaction> filter(List<Transaction> transactions);
   String getDescription();

}
