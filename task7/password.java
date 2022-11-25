import java.util.*;
public class password {
    String name;

    public static boolean isLetter(char l)
    {
        return (l >= 'a' && l <= 'z');
    }
    public static boolean isDigit(char l)
    {
        return (l >= '0' && l <= '9');
    }

    public void check() {
        if (name.length() < 10) {
            System.out.println("A password must have at least ten characters");
            return;
        }   
        int amountDigit = 0;

        for(int i = 0; i < name.length(); i++) {
            if(!isLetter(name.charAt(i)) && !isDigit(name.charAt(i))) {
                System.out.println(" A password consists of only letters and digits");
                return;
            } 
            
            if(name.charAt(i) >= '0' && name.charAt(i) <= '9') {
                amountDigit++; 
            }
        } 
        if (amountDigit < 2) {
            System.out.println("A password must contain at least two digits"); 
            return;
        }
        System.out.println("Password is valid: " + name);
        return;
    }

    public static void main(String[] args) {
        password correct = new password();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Input the password (You are agreeing to the above Terms and Conditions)");
            correct.name = scanner.nextLine().toLowerCase();
            correct.check();
        }
    } 
}

   
    
    
    
    
    
    
    
    
    