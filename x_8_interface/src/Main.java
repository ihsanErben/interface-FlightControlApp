

import java.util.Scanner;
//clean
public class Main {

    public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);
//start
        while (true) {
            //starting
            System.out.print("isim giriniz: ");
            String isim = input.next();

            System.out.print("tc giriniz: ");
            String tc = input.next();

            System.out.print("yas giriniz: ");
            int yas = input.nextInt();

            System.out.print("ne kadar harc yatirdiniz: ");
            int harc = input.nextInt();

            System.out.print("vizeniz var mi: ");
            String vize = input.next();

            System.out.print("sabikaniz var mi: ");
            String sabika = input.next();

            System.out.print("yasaginiz var mi: ");
            String yasak = input.next();

            KisiBilgileri x1 = new KisiBilgileri(isim, tc, yas);
            KisiBilgileri x2 = new KisiBilgileri(harc, vize, sabika, yasak);

            TumKontroller kontroller = new TumKontroller();

            System.out.print("isim kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.isim(x1)) {
                System.out.println("isminiz uyusmuyor. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }

            System.out.print("tc kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.tc(x1)) {
                System.out.println("tc niz uyusmuyor. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }

            System.out.print("yas kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.yas(x1)) {
                System.out.println("yasiniz uyusmuyor. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }

            System.out.print("harc kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.harc(x2)) {
                System.out.println("Vizeniz yok. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }

            System.out.print("vize kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.vize(x2)) {
                System.out.println("isminiz uyusmuyor. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }

            System.out.print("sabika kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.sabika(x2)) {
                System.out.println("Sabika kaydiniz var. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }

            System.out.print("yasak kontrolu yapiliyor: ");
            Thread.sleep(1500);
            if (!kontroller.yasak(x2)) {
                System.out.println("Yurt disi yasaginiz var. Yurt Disina Cikamazsiniz.");
                return;
            } else {
                System.out.println("ONAYLANDI");
            }
            System.out.println("");
            System.out.println("TUM YURT DISI ISLEMLERINIZ TAMAMLANMISTIR. IYI YOLCULUKLAR DILERIZ.");
            return;
        }

    }

}
