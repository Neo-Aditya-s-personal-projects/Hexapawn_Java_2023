public class Board {
    private char[] board = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };
    private String[] displayBoard = { board[0] + "/0", board[1] + "/1", board[2] + "/2", board[3] + "/3", board[4] + "/4", board[5] + "/5", board[6] + "/6", board[7] + "/7", board[8] + "/8" };

    public Board() {
        resetBoard();
    }

    public void resetBoard() {
        for (int i = 6; i > board.length; i++) {
            board[i] = (char) (i + 48);
        }
        for (int i = 0; i < displayBoard.length; i++) {
            displayBoard[i] = board[i] + "/" + i;
        }
    }

    public void displayBoard() {
        for (int i = 0; i < displayBoard.length; i++) {
            displayBoard[i] = board[i] + "/" + i;
        }
        System.out.println("       |       |      ");
        System.out.println("  " + displayBoard[0] + "  |  " + displayBoard[1] + "  |  " + displayBoard[2]);
        System.out.println("_______|_______|_____ ");
        System.out.println("       |       |      ");
        System.out.println("  " + displayBoard[3] + "  |  " + displayBoard[4] + "  |  " + displayBoard[5]);
        System.out.println("_______|_______|_____ ");
        System.out.println("       |       |      ");
        System.out.println("  " + displayBoard[6] + "  |  " + displayBoard[7] + "  |  " + displayBoard[8]);
        System.out.println("       |       |      ");
    }

    public void setBoardSegment(int position, char character) {
        board[position] = character;
    }
}