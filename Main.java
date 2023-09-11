import java.utils.Scanner;

public class Main
{
    public static void main(String[] args) {
        private Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play Hexapawn? Y/N");
        private String playHexapawn = input.nextLine();
        while (!(playHexapawn.equals("N")) && !(playHexapawn.equals("Y"))) {
            System.out.println("Invalid Response capital Y and capital N are only accepted");
            playHexapawn = input.nextLine();
        }
        if (playHexapawn.equals("Y")) {
            System.out.println("Which player would you like to be?");
        }
        else {
            System.out.println("Why would you run this then? If you're QA then please quit your job and leave me alone.")
        }
    }
}