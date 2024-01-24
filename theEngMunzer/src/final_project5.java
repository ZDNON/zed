import java.util.Scanner;
public class final_project5 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Dosya tam adi giriniz : ");
        String s1=inp.nextLine();
        int nokta=s1.lastIndexOf(".");
        String Dismi=s1.substring(0,nokta);
        String duza=s1.substring(nokta+1);
        System.out.println("Dosya adi: "+Dismi);
        System.out.println("Dosya uzanti: "+duza);
    }
}