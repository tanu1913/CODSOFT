import java.util.*;
public class NumberGame {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Random r=new Random();

    int randomNumber=r.nextInt(100);
    int userGuessed=0;
    int userTries=7;

    System.out.println("-------WELCOME TO THE NUMBER GUESSING NAME------");
    System.out.println("I have selected a number between 1 to 100 \n------------------Try to guess the number------------------");
     
    while (userGuessed!=randomNumber && userTries>0) {
        System.out.print("Enter your guess :  ");
        userGuessed=s.nextInt();
        userTries--;

        if(userGuessed<randomNumber){
            System.out.println("Oh! Bad luck, You have guessed too less than my generated number...");
            if(userTries>0){
                System.out.println("Attempts left:   "+userTries);
            }
        }else if(userGuessed>randomNumber){
            System.out.println("Oh! Bad Luck, You have guessed too more than my generated number....");
            if(userTries>0){
                System.out.println("Attempts left:   "+userTries);
            }
        }else{
            System.out.println("Congratulations!!!!  You have guessed the correct number....");
       
        }

        
    }

    if(userGuessed!=randomNumber){
        System.out.println("Sorry ! You have run out of attempts. The correct number to guess was    "+randomNumber+".");
    }
        s.close();
  }
}
