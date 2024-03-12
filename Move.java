public class Move {
    private final Board board;
    private final char playerPiece;
    private final char botPiece;

    public Move(Board board, char playerPiece, char botPiece) {
        this.board = board;
        this.playerPiece = playerPiece;
        this.botPiece = botPiece;
    }

    public boolean MovPiece(int startPosition, int endPosition, boolean playerTurn) {
        if ((board.getBoardSegmentWithoutNumbers(startPosition) == board.getBoardSegmentWithoutNumbers(endPosition)) || board.getBoardSegmentWithoutNumbers(startPosition) == null) {
            return false;
        }
        if (board.getBoardSegmentWithoutNumbers(endPosition) == null) {
            if (canMove(startPosition, endPosition, playerTurn)) {
                board.setBoardSegment(startPosition, (char) (startPosition + 48));
                if(playerTurn) board.setBoardSegment(endPosition, playerPiece);
                else board.setBoardSegment(endPosition, botPiece);
                return true;
            }
            return false;
        }
        if (canCapture(startPosition, endPosition, playerTurn)) {
            board.setBoardSegment(startPosition, (char) (startPosition + 48));
            if(playerTurn) board.setBoardSegment(endPosition, playerPiece);
            else board.setBoardSegment(endPosition, botPiece);
            return true;
        }
        return false;
    }

    public boolean canCapture(int startPosition, int endPosition, boolean playerTurn) {
        if ((board.getBoardSegmentWithoutNumbers(endPosition) == null) || (board.getBoardSegmentWithoutNumbers(startPosition) == null)) {
            return false;
        }
        if (endPosition % 3 == 0) {
            return playerTurn ? endPosition == (startPosition + 2) : startPosition == (endPosition - 4);
        }
        if (endPosition % 3 == 2) {
            return playerTurn ? endPosition == (startPosition + 4) : startPosition == (endPosition - 2);
        }
        return playerTurn ? (endPosition == (startPosition + 4) || endPosition == (startPosition + 2)) : (startPosition == (endPosition - 2) || startPosition == (endPosition - 4));
        
    }

    public boolean canMove(int startPosition, int endPosition, boolean playerTurn) {
        if ((board.getBoardSegmentWithoutNumbers(endPosition) != null)) {
            return false;
        }
        return playerTurn ? endPosition == (startPosition + 3) : endPosition == (startPosition - 3);
    }
}
