package commands;

public interface ICommandService {

    void start();
    void registerCommand(Command command);
    void executeCommand(String commandInput);

}
