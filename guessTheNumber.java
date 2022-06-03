import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int theAnswer = rand.nextInt(10);
        boolean guessed = false;
        
        
        do{
            System.out.println("Guess the number from 1 - 10");
            int usersGuess = sc.nextInt();
            
            if(usersGuess < theAnswer){
                System.out.println("Too low..");
            }else if(usersGuess > theAnswer){
                System.out.println("Too high..");
            }else if(usersGuess == theAnswer){
                System.out.println("You guessed it!");
                guessed = true;
            }
            
        }while(guessed != true);
        
        
        
    }
}
