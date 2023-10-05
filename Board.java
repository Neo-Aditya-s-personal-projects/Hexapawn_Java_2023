public class Board
{
    private String[] board = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    private String[] displayBoard = {board[0] + "/0", board[1] + "/1", board[2] + "/2", board[3] + "/3", board[4] + "/4", board[5] + "/5", board[6] + "/6", board[7] + "/7", board[8] + "/8"};
    private char aiChar;
    private char playerChar;
    public static void setupBoard(char aiChar, char playerChar) {
        this.aiChar = aiChar;
        this.playerChar = playerChar;
        board[0] = playerChar;
        board[1] = playerChar;
        board[2] = playerChar;
        board[6] = aiChar;
        board[7] = aiChar;
        board[8] = aiChar;
    }
    public static boolean updateBoard(int initialPosition, int finalposition, boolean isPlayer) {
        boolean isValid = true;
        if (isPlayer) {
        isValid = (((finalposition - initialPosition) <= 6) && (finalposition > initialPosition));
        boolean isValidPiece = ((board[initialPosition].equals(playerChar)) && !(position[initialPosition].equals(position[finalposition])));
        boolean isValidMovement = validMovement(initialPosition, finalPosition);
        isValid = (isValidPiece && isValidMovement);
        }
        if (isValid) {
            board[finalPosition] = board[initialPosition];
            board[initialPosition] = initialPosition;
        }
    }

    public static void displayBoard() {
        displayBoard = {board[0] + "/0", board[1] + "/1", board[2] + "/2", board[3] + "/3", board[4] + "/4", board[5] + "/5", board[6] + "/6", board[7] + "/7", board[8] + "/8"};
        System.out.println("       |       |      ");
        System.out.println("  " + displayBoard[0] + "  |  " + displayBoard[1]"  |  " + displayBoard[2]);
        System.out.println("_______|_______|_____ ");
        System.out.println("       |       |      ");
        System.out.println("  " + displayBoard[3] + "  |  " + displayBoard[4] + "  |  " + displayBoard[5]);
        System.out.println("_______|_______|_____ ");
        System.out.println("       |       |      ");
        System.out.println("  " + displayBoard[6] + "  |  " + displayBoard[7] + "  |  " + displayBoard[8]);
        System.out.println("       |       |      ");
    }

    private static boolean validMovement(int initialPosition, int finalposition) {
        if(board[finalPosition].equals(aiChar)) {
            return validCapture(initialPosition, finalPosition);
        }
        else if(board[finalPosition].equals(playerChar)) {
            return false;
        }
        else{
            return (finalPosition == (initialPosition + 3));
        }
    }
    private static boolean validCapture(int initialPosition, int finalposition)(
        if((board[initialPosition].equals(aiChar)) || (board[finalPosition].equals(playerChar))) {
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