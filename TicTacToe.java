import java.util.Scanner;

public class TicTacToe {
  
  public static Scanner input = new Scanner(System.in);
  
  public static String nameGreetings(){
    System.out.println("Welcome to Tic Tac Toe!");
    System.out.println("What is your name?");
    return input.nextLine();
  }

  public static void main(String[] args) {
    // Welcoming block
    String playerName = nameGreetings();
    System.out.println(playerName + " you are player 1");
    
    // Selecting marker block
    Scanner input = new Scanner(System.in);
    System.out.println("Choose your marker: O or X?\n");
    String playerMarker = input.nextLine().toUpperCase();

    if (playerMarker.equals("O") || playerMarker.equals("X")) {
      System.out.println(playerMarker + " is a good choice \n");
    } else {
      System.out.println(playerMarker + " is a wrong letter \n");
    }

    System.out.println("Choose your position \n"
        + "1  2  3 \n"
        + "4  5  6 \n"
        + "7  8  9 \n");
    String playerTurn = input.nextLine();

  }
}