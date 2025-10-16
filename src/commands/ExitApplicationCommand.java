package commands;

public class ExitApplicationCommand extends Command {

    public ExitApplicationCommand(){

        super("AVSLUTA", "Avsluta och stänga ner programmet");

    }

    @Override
    public void execute() {



            System.out.println("\n");
            System.out.println("Programmet avslutas...");
            System.out.println("\n");



        System.exit(0);

    }
}
