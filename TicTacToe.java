import java.util.Scanner;

public class TicTacToe {

  public static Scanner input = new Scanner(System.in);

  public static int chooseOption() {
    // GET Board Size
    int option = 0;
    System.out.println("Choose your board size: small (s) or large (l)");
    String choice = input.nextLine();
    if (choice.equals("s")) {
      option = 3;
    } else if (choice.equals("l")) {
      option = 4;
    } else {
      System.out.println(choice + " is a wrong option \n");
    }
    return option;
  }

  public static void main(String[] args) {
    // GREETINGS
    System.out.println("Welcome to Tic Tac Toe!\n");
    int boardSize = 0;
    while (boardSize == 0) {
      boardSize = chooseOption();
    }

    System.out.println("Player 1, what is your name?");
    String nameA = input.nextLine();
    User playerA = new User();
    playerA.setName(nameA);
    playerA.setMarker("X");
    System.out.println(playerA.getName() + " You are playing with " + playerA.getMarker() + "\n");

    System.out.println("Player 2, what is your name?");
    String nameB = input.nextLine();
    User playerB = new User();
    playerB.setName(nameB);
    playerB.setMarker("O");
    System.out.println(playerB.getName() + " You are playing with " + playerB.getMarker() + "\n");

    Board playBoard = new Board();
    String[] gameBoard = playBoard.makeBoard(boardSize);

    System.out.println(playerA.name + " select number for your next move: \n");
    String userChoice = input.nextLine();
    gameBoard = playBoard.updateBoard(gameBoard, playerA.getMarker(), userChoice);
    playBoard.printBoard(boardSize, gameBoard);

    for (int i=0; i<4; i++){
      System.out.println(playerB.name + " select number for your next move: \n");
      userChoice = input.nextLine();
      gameBoard = playBoard.updateBoard(gameBoard, playerB.getMarker(), userChoice);
      playBoard.printBoard(boardSize, gameBoard);
      System.out.println(playerA.name + " select number for your next move: \n");
      userChoice = input.nextLine();
      gameBoard = playBoard.updateBoard(gameBoard, playerA.getMarker(), userChoice);
      playBoard.printBoard(boardSize, gameBoard);
    }
  }

}
