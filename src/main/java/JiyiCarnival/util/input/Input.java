package JiyiCarnival.util.input;
import java.util.Scanner;

public class Input {
    public static int input() {
        Scanner scan = new Scanner(System.in);
        String visitorInput = scan.nextLine();
        int choice;
        try{
           choice = Integer.parseInt(visitorInput);
        }
        catch (NumberFormatException e){
            choice = -1;
        }
        return choice;
    }
}
