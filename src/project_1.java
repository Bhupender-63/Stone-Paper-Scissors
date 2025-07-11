import java.util.Scanner;
public class project_1 {
    public static void main(String[] args) {
        //login system
        System.out.println("Welcome to my application");
        System.out.println("Please enter your password tiger");
        Scanner sc = new Scanner(System.in);
        String password = "tiger@123";
        String input = "";
        while(!input.equals(password)){
            input = sc.nextLine();
            if(input.equals(password))
                System.out.println("login successful");
            else{
                System.out.println("your password is incorrect");
                System.out.println("please enter a valid password");
            }
        }
    }
}
