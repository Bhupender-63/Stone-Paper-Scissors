import java.util.Scanner;
public class Project_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.login");
            System.out.println("2.attendance");
            System.out.println("3.fees");
            System.out.println("4.calender");
            System.out.println("5.exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("you have succesfully logged");
                    break;
                case 2:
                    System.out.println("50% attendance");
                    break;
                case 3:
                    System.out.println("your fees is due kindly paid it");
                    break;
                case 4:
                    System.out.println("upcoming holiday 15 july");
                    break;
                case 5:
                    System.out.println("thanks for visiting");
                    break;
                default:
                    System.out.println("please enter a valid choice");
                    break;
            }
        }
        while(choice!=5);
    }
}
