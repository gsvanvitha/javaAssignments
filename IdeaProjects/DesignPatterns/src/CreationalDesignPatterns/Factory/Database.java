package Factory;

public interface Database {
    public void createDatabase(String databaseName);
}

//MySql class implementing interface Database
class MySql implements Database{
    @Override
    public void createDatabase(String databaseName){
        System.out.println("A database - "+databaseName+" of type MySql has been created");
    }
}
//Oracle class implementing interface Database
class Oracle implements Database{
    @Override
    public void createDatabase(String databaseName){
        System.out.println("A database - "+databaseName+" of type Oracle has been created");
    }
}

