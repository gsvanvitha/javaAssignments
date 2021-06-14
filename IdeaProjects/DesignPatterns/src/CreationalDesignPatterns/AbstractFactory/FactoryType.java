package AbstractFactory;

public interface FactoryType {
    public Database databaseType(String databaseType);
}

class SqlDatabaseFactory implements FactoryType{
    @Override
    public Database databaseType(String databaseType){
        switch(databaseType){
            case "MySql":
                return new MySql();
            case "Oracle":
                return new Oracle();
            default:
                return null;
        }
    }
}
class NoSqlDatabaseFactory implements FactoryType{
    @Override
    public Database databaseType(String databaseType){
        switch(databaseType){
            case "Document":
                return new DocumentDatabase();
            case "Graph":
                return new GraphDatabase();
            default:
                return null;
        }
    }
}
