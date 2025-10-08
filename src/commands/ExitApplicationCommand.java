package commands;

public class ExitApplicationCommand extends Command {

    public ExitApplicationCommand(){

        super("exit-application", "Exit application");

    }

    @Override
    public void execute() {



            System.out.println("\n");
            System.out.println("Programmet avslutas...");
            System.out.println("\n");



        System.exit(0);

    }
}
