import java.utils.Scanner;

public class SideChooser
{
    private boolean isFirst = true;
    public static void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to go First or Second?")
        String sideChosen = input.nextLine();
        while (!(sideChosen.equals("First")) && !(sideChosen.equals("Second"))) {
            System.out.println("Invalid response, would you like to go First or Second?")
        }
        isFirst = sideChosen.equals("First");
        if (isFirst) {

        }
        else{
            
        }
    }
    public static boolean playerIsFirst() {
        return isFirst;
    }
}