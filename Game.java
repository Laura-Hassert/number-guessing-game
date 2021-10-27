/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello there! What's your name?");

    System.out.print("(type your name) ");
    String name = input.nextLine();  
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number.");

    Random rand = new Random();
    int number = rand.nextInt(100);
    int guess = 0;
    int numOfGuesses = 1;

    while (guess != number) {
      
      System.out.print("Your guess? ");
      try {
        guess = input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Please enter a number. Try again.");
        input.next();
        continue;
      }
      
      if (guess > 100 || guess < 1) {
        System.out.println("You fool! I said between 1 and 100! Try again.");
      } else if(guess > number) {
          numOfGuesses++;
          System.out.println("Your guess is too high, try again.");
      } else if (guess < number) {
          numOfGuesses++;
          System.out.println("Your guess is too low, try again.");
      } 
    }
    System.out.println("Well done, " + name + "! You found my number in " + numOfGuesses + " tries!");
    input.close();
  }
} 
