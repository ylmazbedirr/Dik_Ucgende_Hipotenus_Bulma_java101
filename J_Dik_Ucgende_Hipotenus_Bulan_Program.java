import java.util.Scanner;
public class J_Dik_Ucgende_Hipotenus_Bulan_Program {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        /* Hipotenüs Bulma -start-


        // Değişkenleri oluşturalım;
        int a,b;
        double c;

        System.out.print("1. Kenari Giriniz :");
        a = girdi.nextInt();

        System.out.print("2. Kenari Giriniz :");
        b = girdi.nextInt();


        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus" + c);

        Hipotenüs bulma -end- */

        //Degiskenlerimiz
        double birinciKenar, ikinciKenar, ucuncuKenar, cevre, alan, u;

        System.out.print("Birinci Kenari Giriniz :");
        birinciKenar = girdi.nextDouble();

        System.out.print("Ikinci Kenari Giriniz");
        ikinciKenar = girdi.nextDouble();

        System.out.print("Ucuncu Kenari Giriniz :");
        ucuncuKenar = girdi.nextDouble();

        cevre = (birinciKenar + ikinciKenar + ucuncuKenar);
        u = cevre / 2;

        alan = Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.println("Ucgenin Cevresi" + cevre);
        System.out.println("Ucgenin Alani" + alan);


    }
}
