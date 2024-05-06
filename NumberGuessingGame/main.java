import java.util.Scanner;
import java.util.Random;
class main{
    public static void main(String[] args) {
        Random x = new Random();
        Scanner input = new Scanner(System.in);
        int n = x.nextInt(100)+1;
        int guess;
        System.out.println("Welcome to the number guessing game");
        System.out.println("You will be asked to guess a number to win game");
        System.out.println("You have maximum 5 Attempt Limit");
        System.out.println("Guess a number between 1 and 100:-");
        for(int i=0;i<5;i++){
            guess = input.nextInt();
            if(guess==n){
                System.out.println("Congratulations! your number is correct You win the Game!");
                break;
            }else if(guess<n) System.out.println("Your guess number is Smaller");
            else System.out.println("Your guess number is Greater");
        }
        System.out.println("Sorry!! You had only 5 attempts better luck next time");
    }
}