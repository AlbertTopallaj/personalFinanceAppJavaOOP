package repository;

import org.w3c.dom.ls.LSOutput;

public class DatabaseTransactionRepository implements ITransactionRepository {

    @Override
    public void save(){

        System.out.println("Save to database");

    }

    @Override
    public void load(){

        System.out.println("Load from database");

    }

    @Override
    public void delete(){

        System.out.println("Delete from database");

    }

    @Override
    public void update(){

        System.out.println("Update database");

    }


}
