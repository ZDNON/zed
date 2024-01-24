import java.util.Scanner;

public class TKM {
    public static void main(String[] args) {
        String[] tkm = {"rock","paper","scissors"};
        Scanner inp=new Scanner(System.in);
        int AI=(int)(Math.random()*tkm.length);
        System.out.print("enter 0 for rock 1 for paper 2 for scissors : ");
        int U =inp.nextInt();
        if ((U==0 && AI==2) || (U==1 && AI==0) || (U==2 && AI==1)){
            System.out.printf("program : %s",tkm[AI]);
            System.out.printf("\nyou: %s",tkm[U]);
            System.out.println("\nyou win...!");
        } else if ((U == 2 && AI == 0) || (U == 0 && AI == 1) || (U == 1 && AI == 2)) {
            System.out.printf("program : %s", tkm[AI]);
            System.out.printf("\nyou: %s", tkm[U]);
            System.out.println("\nyou lost...!");
        } else {
            System.out.printf("program : %s", tkm[AI]);
            System.out.printf("\nyou: %s", tkm[U]);
            System.out.println("\nno one wins...!");
        }
    }
}
