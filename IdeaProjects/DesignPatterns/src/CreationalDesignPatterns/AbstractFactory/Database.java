package AbstractFactory;

public interface Database {
    public void createDatabase(String databaseName);
}
//MySql class implementing interface Database
class MySql implements Database {
    @Override
    public void createDatabase(String databaseName){
        System.out.println("A SQl database - "+databaseName+" of type MySql has been created");
    }
}
//Oracle class implementing interface Database
class Oracle implements Database {
    @Override
    public void createDatabase(String databaseName){
        System.out.println("A SQL database - "+databaseName+" of type Oracle has been created");
    }
}
//GraphDatabase class implementing interface Database
class GraphDatabase implements Database {
    @Override
    public void createDatabase(String databaseName){
        System.out.println("A NoSql database - "+databaseName+" of type GraphDatabase has been created");
    }
}
//DocumentDatabase class implementing interface Database
class DocumentDatabase implements Database {
    @Override
    public void createDatabase(String databaseName){
        System.out.println("A NoSql database - "+databaseName+" of type DocumentDatabase has been created");
    }
}
