import java.util.Scanner;

public class TicTacToe{

  public static void main(String[] args){
    // Welcoming block
    System.out.println("Welcome to Tic Tac Toe!");
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String playerName = input.nextLine();
    System.out.println(playerName+" you are player 1");

    //Selecting marker block
    System.out.println("Choose your marker: O or X?");
    String playerMarker = input.nextLine().toUpperCase();
    
    
    if (playerMarker.equals("O") || playerMarker.equals("X")){
      System.out.println(playerMarker+ " is a good choice");
    } else {
      System.out.println(playerMarker+ " is a wrong letter");
    }
    

    
  }
}