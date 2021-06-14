package Factory;
public interface DatabaseFactory {
    public Database typeOfDatabase(String databaseType);
}
//DatabaseType class implements DatabaseFactory
class DatabaseType implements DatabaseFactory{
    @Override
    public Database typeOfDatabase(String databaseName) {
       switch(databaseName){
           case "MySql":
               return new MySql();
           case "Oracle":
               return new Oracle();
           default:
               return null;
       }
    }
}