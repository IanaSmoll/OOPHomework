import java.sql.ResultSet;
import java.util.*;

public class vowel {
    String text;
    String text1;
    int amountVow = 0;
    char temp;

    public void count() {
        for(int i = 0; i < text.length(); i++) {
            text1 = text.toLowerCase();
            temp = text1.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'y'){
                amountVow++;
            }
        }
        System.out.println("Amount of vowel letters = " + amountVow);
    }
    
 
    public static void main(String[] args) {
    vowel amount = new vowel();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the text");
    amount.text = scanner.nextLine();
    amount.count();
}
}
