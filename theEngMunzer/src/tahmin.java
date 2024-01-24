import java.util.Scanner;

public class tahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int)(Math.random()*101);
        int attempts = 0;
        int guess;
        System.out.println("Tahmin Oyunu");
        do {
            System.out.print("0 ile 100 arasında bir sayı tahmin edin: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Tahmininiz küçük, tekrar deneyin.");
            } else if (guess > secretNumber) {
                System.out.println("Tahmininiz büyük, tekrar deneyin.");
            } else {
                System.out.println("Tebrikler! Sayı: " + secretNumber + ". " + attempts + " kere denediniz.");
            }
        } while (guess != secretNumber);
        scanner.close();
    }
}
