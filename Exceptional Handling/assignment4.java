import java.util.InputMismatchException;
// Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) 
// and ensure that the age entered is >=18 and < 60. 
// Display proper error messages. 

// The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
public class assignment4 {
    public static void main(String[] args) {
        try{
        String name= args[0];
        int age= Integer.parseInt(args[1]);
        if(age>=18 && age<60){
            System.out.println("age is granted");
        }
        else{
            System.out.println("age is not granted");
        }
        }
        catch(InputMismatchException |NumberFormatException e){
            System.out.println(e);
        }
        
    }
}
