import java.util.Scanner;

public class TicTacToe {

  public static Scanner input = new Scanner(System.in);

  public static String nameGreetings() {
    // welcome block
    System.out.println("Welcome to Tic Tac Toe!");
    System.out.println("What is your name?");
    return input.nextLine();
  }

  public static String chooseMarker() {
    // marker block
    System.out.println("Choose your marker: O or X?\n");
    String playerMarker = input.nextLine();
    playerMarker = playerMarker.toUpperCase();
    if (playerMarker.equals("O") || playerMarker.equals("X")) {
      System.out.println(playerMarker + " is a good choice \n");
    } else {
      System.out.println(playerMarker + " is a wrong letter \n");
      chooseMarker();
    }
    return playerMarker;
  }

  public static String compMarker(String playerMarker) {
    if (playerMarker.equals("X")) {
      return "X";
    } else {
      return "O";
    }
  }

  public static String updateBoard(String mainBoard, String playerMarker, String playerTurn) {
    System.out.println(playerTurn);
    mainBoard = mainBoard.replace(playerTurn, playerMarker);
    System.out.println(mainBoard);
    return mainBoard;
  }

  public static void main(String[] args) {
    String playerName = nameGreetings();
    System.out.println(playerName + " you are player 1\n");
    String playerMarker = chooseMarker();
    System.out.println(compMarker(playerMarker));
    String mainBoard = "\n| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |\n";
    for (int i = 0; i < 3; i++) {
      System.out.println(mainBoard);
      System.out.println("Choose the number as your next move");
      String playerTurn = input.nextLine();
      mainBoard = updateBoard(mainBoard, playerMarker, playerTurn);

    }
  }
}