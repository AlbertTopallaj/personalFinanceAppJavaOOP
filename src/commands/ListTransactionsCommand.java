package commands;

public class ListTransactionsCommand extends Command {

    public ListTransactionsCommand(){

        super("list-transactions", "List all created transactions");

    }

    @Override
    public void execute() {

        System.out.println("List transactions");

    }
}
