public enum BotMovementTurnStates {
    Turn2State1,
    Turn2State2,
    Turn4State1,
    Turn4State2,
    Turn4State3,
    Turn4State4,
    Turn4State5,
    Turn4State6,
    Turn4State7,
    Turn4State8,
    Turn4State9,
    Turn4State10,
    Turn4State11,
    Turn6State1,
    Turn6State2,
    Turn6State3,
    Turn6State4,
    Turn6State5,
    Turn6State6,
    Turn6State7,
    Turn6State8,
    Turn6State9,
    Turn6State10,
    Turn6State11;

    public static String[] Turn2State1Beads = {"Green", "Blue", "Purple"};
    public static String[] Turn2State2Beads = {"Green", "Blue"};
    public static String[] Turn4State1Beads = {"Green", "Purple"};
    public static String[] Turn4State2Beads = {"Green", "Blue", "Purple"};
    public static String[] Turn4State3Beads = {"Green", "Blue", "Purple"};
    public static String[] Turn4State4Beads = {"Orange"};
    public static String[] Turn4State5Beads = {"Blue", "Purple"};
    public static String[] Turn4State6Beads = {"Green", "Blue", "Purple"};
    public static String[] Turn4State7Beads = {"Green", "Blue", "Purple", "Orange"};
    public static String[] Turn4State8Beads = {"Green", "Purple"};
    public static String[] Turn4State9Beads = {"Green", "Blue", "Purple", "Orange"};
    public static String[] Turn4State10Beads = {"Green", "Blue"};
    public static String[] Turn4State11Beads = {"Purple", "Orange"};
    public static String[] Turn6State1Beads = {"Purple", "Orange"};
    public static String[] Turn6State2Beads = {"Purple", "Orange"};
    public static String[] Turn6State3Beads = {"Blue", "Purple"};
    public static String[] Turn6State4Beads = {"Blue"};
    public static String[] Turn6State5Beads = {"Green", "Orange"};
    public static String[] Turn6State6Beads = {"Green", "Purple"};
    public static String[] Turn6State7Beads = {"Green", "Purple", "Orange"};
    public static String[] Turn6State8Beads = {"Green", "Blue"};
    public static String[] Turn6State9Beads = {"Purple", "Orange"};
    public static String[] Turn6State10Beads = {"Purple", "Orange"};
    public static String[] Turn6State11Beads = {"Blue", "Purple"};

    public static int[] turnTwoMove(BotMovementTurnStates botMovementTurnState) {
        int[] i = {1, 2, 3};
        return i;
    }

    public static BotMovementTurnStates getBotMovementTurnStates(int turnCount, Board board, char botPiece, char playerPiece) {
        if (turnCount == 2) {
            return (board.getBoardSegmentWithoutNumbers(4) == null) ? Turn2State2: Turn2State1;
        }
        if (turnCount == 4) {
            if (board.getBoardSegmentWithoutNumbers(4) == null) {
                if (board.getBoardSegmentWithoutNumbers(7) == null) {
                    return (board.getBoardSegmentWithoutNumbers(3) == null || board.getBoardSegmentWithoutNumbers(5) == null) ? Turn4State4 : Turn4State10;
                }
                return Turn4State3;
            }
            if (board.getBoardSegmentWithoutNumbers(4) == botPiece) {
                
            }
        }
        return null;
    }
}