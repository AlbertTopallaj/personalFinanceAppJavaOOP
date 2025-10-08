package commands;

public class DeleteTransactionCommand extends Command {

    public DeleteTransactionCommand(){

        super("delete-transaction", "Remove transaction");

    }
    @Override
    public void execute() {

        System.out.println("Delete transaction");

    }
}
