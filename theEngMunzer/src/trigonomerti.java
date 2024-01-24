public class trigonomerti {
    public static void main(String[] args){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s","Derece","Radyan","Sinus","cosinus","tanjant");
        int derece = 30;
        double radyan = Math.toRadians(derece);
        System.out.printf("\n%-10d%-10.4f%-10.4f%-10.4f%-10.4f",derece,radyan,
                Math.sin(radyan),Math.cos(radyan),Math.tan(radyan));
        derece = 60;
        radyan=Math.toRadians(derece);
        System.out.printf("\n%-10d%-10.4f%-10.4f%-10.4f%-10.4f",derece,radyan,
                Math.sin(radyan),Math.cos(radyan),Math.tan(radyan));

    }
}
