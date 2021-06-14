package AbstractFactory;

import java.util.Scanner;

//A DatabaseType class to call Sql or NoSql
class DatabaseType{
    public static FactoryType getDatabaseType(String databaseType){
        switch(databaseType){
            case "Sql":
                return new SqlDatabaseFactory();
            case "NoSql":
                return new NoSqlDatabaseFactory();
            default:
                return null;
        }
    }
}
public class User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Sql or NoSql
        System.out.println("Enter the type of database");
        String type = sc.next();
        FactoryType factoryType = DatabaseType.getDatabaseType(type);
        //sub type in Sql or NoSql
        System.out.println("Enter type of "+type+" database");
        String databaseType= sc.next();
        Database database = factoryType.databaseType(databaseType);
        //name of the database
        System.out.println("Enter the name of "+type+" "+databaseType+" database");
        String databaseName = sc.next();
        database.createDatabase(databaseName);
    }
}
