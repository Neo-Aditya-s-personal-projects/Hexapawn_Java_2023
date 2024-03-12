import java.util.Scanner;

public class SideChooser {
    private boolean isFirst = true;
    private final Scanner input;

    public SideChooser(Scanner input) {
        this.input = input;
    }

    public void PickSide() {
        System.out.println("Would you like to go First or Second?");
        String sideChosen = input.nextLine();
        while (!(sideChosen.equals("First")) && !(sideChosen.equals("Second"))) {
            System.out.println("Invalid response, would you like to go First or Second?");
        }
        isFirst = sideChosen.equals("First");
    }

    public boolean playerIsFirst() {
        return isFirst;
    }
}