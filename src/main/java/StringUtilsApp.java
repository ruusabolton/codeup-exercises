//import utility to interact with user
import java.util.Scanner;

//import utility to manipulate string
import org.apache.commons.lang3.StringUtils;


public class StringUtilsApp {

    public static void main(String[] args) {

// utility variable to read what user types up
        Scanner sc = new Scanner(System.in);
// prompt for user to type something
        System.out.println("Enter something awesome:");
// user's entry will be stored in input-variable
        String input = sc.nextLine();
// is input a number
        System.out.println(StringUtils.isNumeric(input));
// change the case of whatever the user entered, regardless of case
        System.out.println(StringUtils.swapCase(input));
// change the order of the string
        System.out.println(StringUtils.reverse(input));
    }

}
