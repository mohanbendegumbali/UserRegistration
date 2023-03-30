import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegUtility {
    public boolean validateFirstName(String firstName) {
        String validFirstName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First Name is valid!!");
            return true;
        } else {
            System.out.println("First Name is Invalid!!");
            return false;
        }
    
}
