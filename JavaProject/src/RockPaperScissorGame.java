import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void RPS(int value){
        Random randValue = new Random();
        int computerValue = randValue.nextInt(3);
        if(computerValue == value){
            System.out.println("Computer also chose same value please try again");
            return;
        } else if (value == 0) {
            if(computerValue == 1){
                System.out.println("You Chose Rock and Computer chose Paper, Computer Won You lost");
                return;
            } else if (computerValue == 2) {
                System.out.println("You Chose Rock and Computer chose Scissor, Computer Lost You Won !! Hurray!!");
                return;
            }
        } else if (value == 1) {
            if(computerValue == 0){
                System.out.println("You Chose Paper and Computer chose Rock, Computer Lost You Won!! Hurray!!");
                return;
            } else if (computerValue == 2) {
                System.out.println("You Chose Paper and Computer chose Scissor, Computer Won You Lost");
                return;
            }
        }else{
            if(computerValue == 0){
                System.out.println("You Chose Scissor and Computer chose Rock, Computer Won You Lost");
                return;
            } else if (computerValue == 2) {
                System.out.println("You Chose Scissor and Computer chose Paper, Computer Lost You Won");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        Boolean continuePlayingGame = true;
        while(continuePlayingGame){
            System.out.println("Please enter 0 If you want to choose Rock, 1 If you want to choose Paper and 2 for scissor");
            value = input.nextInt();
            RPS(value);
            System.out.println("Do you want to play again, If yes type Yes, else type No");
            String valueString = input.next();
            System.out.println(valueString);
            if(valueString.equals("No")){
                System.out.println("You have chosen to stop playing the game");
                continuePlayingGame = false;
            }
        }
    }
}
