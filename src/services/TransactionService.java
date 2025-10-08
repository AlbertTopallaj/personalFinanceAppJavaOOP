package services;

import commands.ICommandService;
import repository.DatabaseTransactionRepository;
import repository.FileTransactionRepository;
import repository.ITransactionRepository;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private ITransactionRepository transactionRepository = new FileTransactionRepository();

    // private ITransactionRepository transactionRepository = new DatabaseTransactionRepository();

    public void createTransaction(){

        transactionRepository.save();

    }

    public void deleteTransaction(){

        transactionRepository.delete();

    }

    public void updateTransaction(){

        transactionRepository.update();

    }



}
