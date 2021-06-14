package Factory;
import java.util.Scanner;
public class User {
    public static void main(String[] args){
        DatabaseType databaseType = new DatabaseType();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of database");
        String type = sc.next();
        Database database = databaseType.typeOfDatabase(type);
        System.out.println("Enter the name of database");
        String databaseName = sc.next();
        database.createDatabase(databaseName);
    }
}
