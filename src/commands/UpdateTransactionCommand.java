package commands;

public class UpdateTransactionCommand extends Command{

    public UpdateTransactionCommand(){

        super("update-transaction", "Update transaction");

    }

    @Override
    public void execute(){

        System.out.println("Update transaction");

    }


}
