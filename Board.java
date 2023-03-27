public class Board {

  public static String[] makeBoard(int gameSize) {
    System.out.println("\n\n ***   The Game Board  ***\n");
    String[] newBoard;
    if (gameSize == 3) {
      newBoard = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    } else {
      newBoard = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
    }
    printBoard(gameSize, newBoard);
    return newBoard;
  }

  public static void printBoard(int gameSize, String[] newBoard) {
    int i = 0;
    for (int row = 0; row < gameSize; row++) {
      for (int col = 0; col < gameSize; col++) {
        System.out.print(newBoard[i++] + " | ");
      }
      System.out.println("\n");
    }
  }

  public static String[] updateBoard(
      String[] mainBoard,
      String playerMarker,
      String playerChoice) {
    int pos = Integer.parseInt(playerChoice);
    mainBoard[pos-1] = playerMarker;
     
    return mainBoard;
  }

}