public class loop2 {
    public static void main(String[] args){
        System.out.println("                Tablo Indisleri ve Indis Toplamalari");
        System.out.print("  |");
        for (int i=1; i<10; i++){
            System.out.printf("%7d",i);
        }

        System.out.println("\n--|-----------------------------------------------------------------------");
        String s1="-";
        for (int i=1;i<10;i++){
            System.out.printf("%d |  ",i);
            for (int j=1;j<10;j++){
                System.out.printf("%d%d%s%-4d",j,i,s1,i+j);
            }
        System.out.println();
        }
    }
}
