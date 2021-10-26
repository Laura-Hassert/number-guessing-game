/*

A number-guessing game.

*/
import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello Player! What's your name?");

    String name = input.nextLine();  
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");
  }

}
