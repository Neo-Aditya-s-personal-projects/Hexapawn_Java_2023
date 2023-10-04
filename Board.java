public class Board
{
    private String[] positions = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
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
        boolean isValidPiece = ((positions[initialPosition].equals(playerChar)) && !(position[initialPosition].equals(position[finalposition])));
        boolean isValidMovement = ValidMovement(initialPosition, finalPosition);
        isValid = (isValidPiece && isValidMovement);
        }
        if (isValid) {
            positions[finalPosition] = positions[initialPosition];
            positions[initialPosition] = initialPosition;
        }
    }

    private static boolean ValidMovement(int initialPosition, int finalposition) {
        if(positions[finalPosition].equals(aiChar)) {
            return ValidCapture(initialPosition, finalPosition);
        }
        else if(positions[finalPosition].equals(playerChar)) {
            return false;
        }
        else{
            return (finalPosition == (initialPosition + 3));
        }
    }
    private static boolean ValidCapture(int initialPosition, int finalposition)(
        if((positions[initialPosition].equals(aiChar)) || (positions[finalPosition].equals(playerChar))) {
            return false;
        }
        if (finalPosition == 4) {
            return ((initialPosition == 0) || (initialPosition == 2));
        }
        else if (initialPosition == 1) {
            return((finalPosition == 3) ||(finalPosition == 5));
        }
        else if(finalPosition == 7 ) {
            return((initialPosition == 3) || (initialPosition == 5));
        }
        else if(initialPosition == 4) {
            return((finalPosition == 6) ||(finalPosition == 8));
        }
        else {
            return false;
        }
    )
}