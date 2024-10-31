/* WAP to generate a random number between 1 to 100 & ask user toguess that nuumber.
 * If user's guess is greater than your number, print "Too large guess...try again"
 * If user's guess is smaller than your number, print "Too samll guess...try again"
 * Repeat this process till either:
 * 1)User guesses the right answer (print: "WOOHOO, You guessed it right!")
 * 2)Give the user a option to stop the program by typing any negative number
 * MAXIMUM ALOOWED ATTEMPTES FOR USER=7
 * If the user guesses the right answered in the limit then alsotell him about the number of attempts he took
 * even if user guesses or not tell him what the number was
 */


import java.util.Scanner;
public class PROJECT {
    public static void project() {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int tries=1;
        System.out.println("Maximum attempts to guess the number: 7");

        do {
            System.out.print("Guess a number between 1 to 100 (to exit type any number less than 1): ");
            guess = sc.nextInt();
            if (guess == num) {
                System.out.println("WOOHOO, You guessed it right!");
                System.out.println("No. of attempts taken: "+(tries));
                break;
            }
            else if(guess>num && guess<100) {
                System.out.println("Too large guess...try again");
            } 
            else if(guess>0 && guess<num) {
                System.out.println("Too small guess...try again");
            }
            else {
                System.out.println("YOU ENTERED NUMBER OUT OF THE RANGE OF 1-100");
                break;
            }
            if (tries >= 7) {
                System.out.println("Maximum attempts limit crossed. Better luck next time!");
                break;
            }
            tries++;    
            
        } while (guess>0);
        System.out.println("My number was: "+ num);
    sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DO YOU WANT TO PLAY A GAME? (Y/N) : ");
        char ch = sc.next().charAt(0);
        if (ch=='Y'||ch=='y') {
            System.out.println("Let's play a game of guessing a random number");
            project();
        }
        else if(ch=='N'||ch=='n') {
            System.out.println("OK...as you wish...GOOD BYE!");
        }
        else {
            System.out.println("Invalid choice");
        }
    sc.close();
    }
}