import java.lang.Math;   
import java.util.Scanner;
public class ugtnum
{
    public static void guessTheNumber(int n){
        String s = "😀";
        System.out.println("Enter the number from 1 to 100\n");
        int guess;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the Number:");
            guess = sc.nextInt();
            if(n>guess){
                System.out.println("The number is larger than you guessed\n"+"Try Again!");
                System.out.println("Enter -1 to stop the game and know the number\n");
                continue;
            }
            else if(n<guess){
                System.out.println("The number is smaller than you guessed \n"+"Try Again!");
                System.out.println("Enter -1 to stop the game and know the number\n");
                continue;
            }
            else if(n==guess) {
                System.out.print("Enter your name :");
                String name = sc.next();
                System.out.println("\n WOHHOO"+s);
                System.out.println("Congratulations! "+name+" You guessed correct number.");
                System.out.println("The Number was : "+ n );
                break;
            }
        }while(guess>0);
        if(guess<0){
            System.out.println("Game Over!");
            System.out.println("The number was : "+n);
            
            System.out.println("Better Luck Next Time!"+s);
        }
    }
	public static void main(String[] args) {
	    int n = (int)(Math.random()*100);
		guessTheNumber(n);
	}
}
