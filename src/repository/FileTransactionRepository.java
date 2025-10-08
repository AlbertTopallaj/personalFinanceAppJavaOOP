package repository;

public class FileTransactionRepository implements ITransactionRepository {

    @Override
    public void save() {
        System.out.println("Save to file!");
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
