import java.util.Scanner;

public class password {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String password="Yazilim2024";
        System.out.print("inter your password : ");
        String password1 = input.nextLine();
        int i = 1;
        while (i<5){
            if (password1.equals(password)){
                System.out.println("welcome back...");
                break;
            }
            else{
                i++;
                System.out.println("you enterd wrong password try again...");
                System.out.print("inter your password : ");
                password1=input.nextLine();

            }
        }

    }
}
