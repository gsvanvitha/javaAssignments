/*Error Handling
Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args){
        CustomerDetails customerDetails = new CustomerDetails();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter user name");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        System.out.println("Enter email id");
        String email = sc.next();
        boolean access = false;
        try {
            access = customerDetails.verifyDetails(username, password, email);
        } catch (emailException | passwordException | usernameException ex) {
            System.out.println("Catch block");
            ex.printStackTrace();
        }
        finally{
            System.out.println("Finally block");
        }
        if(access)System.out.println("Login Successful");
        else System.out.println("Login unsuccessful");
    }
}
class CustomerDetails {
    private String username, password, email;

    CustomerDetails() {
        username = "Java";
        password = "7856";
        email = "java@gmail.com";
    }

    boolean verifyDetails(String username, String password, String email) throws emailException, passwordException, usernameException {
        if (this.username.equals(username)) {
            if (this.password.equals(password)) {
                if (this.email.equals(email)) {
                    return true;
                } else {
                    throw new emailException("Invalid email");
                }
            } else {
                throw new passwordException("Invalid password");
            }
        } else {
            throw new usernameException("Invalid username");
        }
    }
}
class usernameException extends Exception{
    usernameException(String invalid_username){
        System.out.println("Wrong username");
    }
}
class passwordException extends Exception{
    passwordException(String invalid_password){
        System.out.println("Wrong password");
    }
}
class emailException extends Exception{
    emailException(String invalid_email){
        System.out.println("Wrong email");
    }
}
