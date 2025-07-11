import java.util.Scanner;
import java.util.Random;
public class Stone_paper_scissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //Display choice
        System.out.println("Welcome to stone paper scissors");
        System.out.println("Enter your choice:0 for stone,1 for paper,2 for scissors!");

        //Get User choice
        int userChoice = sc.nextInt();
        //Generate computer choice
        int computerChoice = random.nextInt(3);

        //Show Both choices:
        System.out.println("you choose:" + userChoice);
        System.out.println("computer choose:" + computerChoice);

        //Determine winner
        if(userChoice == computerChoice){
            System.out.println("draw the game");
        } else if ((userChoice == 0 && computerChoice == 2)||(userChoice == 1 && computerChoice == 0)||(userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win");
        }
        else{
            System.out.println("Computer wins!");
        }
         int choice=1;
            switch (choice){
                case 0 -> System.out.println("stone");
                case 1 -> System.out.println("paper");
                case 2 -> System.out.println("scissor");
                default -> System.out.println("invalid choice");
            }
    }
}