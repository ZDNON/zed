import java.util.Scanner;

public class shadde {
    public static void main(String[] args) {
        int[] deste = new int[52];
        String[] gruplar = {"maça", "kupa", "karo ", "sinektir"};
        String[] siralar = {"as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "bacak", "kız", "papaz",};
        for (int i = 0; i < deste.length; i++) {
            deste[i] = i;
        }
        for (int i = 0; i < deste.length; i++) {
            int index = (int) (Math.random() * deste.length);
            int temp = deste[i];
            deste[i] = deste[index];
            deste[index] = temp;    
        }
        Scanner input = new Scanner(System.in);
        int j = 0;
        while (j <3) {
            String grup = gruplar[deste[j] / 13];
            String sira = siralar[deste[j] % 13];
            System.out.println("kart numarsi " + deste[j] + ": " + sira + "-" + grup);
            j++;
        }
    }
}
