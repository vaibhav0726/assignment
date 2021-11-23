// A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.

// Step 1: Create a user defined exception class named “InvalidCountryException”.
// Step 2: Overload the respective constructors.
// Step 3: Create a main class “UserRegistration”, add the following method,
// void registerUser(String username,String userCountry) with the below implementation
// • if userCountry is not equal to  “India” throw a InvalidCountryException with the message “User Outside India  cannot be registered”
// • if userCountry is equal to  “India”,  print the message “User registration done successfully”

// Invoke the method registerUser from the main method with the data specified and see how the program behaves.
// Example1)
// i/p:Mickey,US 
// o/p:InvalidCountryException should be thrown.
// The message should be “User Outside India  cannot be registered”

// Example2)
// i/p:Mini,India
// o/p:User registration done successfully
import java.util.*;

class InvalidCountryException extends Exception{
    
    public InvalidCountryException (String str){
        super(str);
    }  
}
public class UserRegistration {
    private String username;
    private String userCountry;
    
    public void registerUser(String username,String userCountry) throws InvalidCountryException{
        if(!userCountry.equals("India")){
            throw new InvalidCountryException("User outside india cannot be registered");
        }
        else{
            this.username=username;
            this.userCountry=userCountry;
            System.out.println("user registration successfully!");
        }

    }
    public static void main(String[] args) {
        UserRegistration obj=new UserRegistration();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username and country name");
        String username=sc.nextLine();
        String userCountry = sc.nextLine();
        try{
            obj.registerUser(username,userCountry);
        }
        catch(InvalidCountryException e){
            System.out.println(e.getMessage());
        }
    }

}
