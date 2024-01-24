import java.util.Scanner;

public class series2 {
    public static void main(String[] args){
        String[] mevsimler={"ilkbahar","yaz","sonbahar","kis"};
        Scanner input=new Scanner(System.in);
        System.out.print("Bir mevsim giriniz (1-4): ");
        int x=input.nextInt();
        System.out.printf("mevsim %s",mevsimler[x-1]);
    }
}
