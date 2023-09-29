public class Board
{
    private char[] positions = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    private char aiChar;
    private char playerChar;
    public static void SetupBoard(char aiChar, char playerChar) {
        this.aiChar = aiChar;
        this.playerChar = playerChar;
        positions[0] = playerChar;
        positions[1] = playerChar;
        positions[2] = playerChar;
        positions[6] = aiChar;
        positions[7] = aiChar;
        positions[8] = aiChar;
    }
    public static boolean UpdateBoard(int initialPosition, int finalposition, boolean isPlayer) {
        boolean isValid = true;
        if (isPlayer) {
        isValid = (((finalposition - initialPosition) <= 6) && (finalposition > initialPosition));
        boolean isValidPiece = ((positions[initialPosition]) && !(position[initialPosition].equals(position[finalposition])));
        boolean isValidMovement = false;
        if ((initialPosition % 2) == (finalposition % 2)) {
            
        }
        }
    }
}