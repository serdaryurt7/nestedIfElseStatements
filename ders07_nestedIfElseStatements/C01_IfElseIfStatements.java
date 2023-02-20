package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal, 20’den kucukse zayif yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz: ");

        int boy = scanner.nextInt();

        System.out.println("Kilonuzu Giriniz: ");

        double kilo = scanner.nextDouble();

         double vke = (kilo*10000 / (boy*boy));
        System.out.println("Vücut Kitle Endeksiniz: " + vke);

         if (vke<20 && vke>0)
             System.out.println("Zayıf");

        else if (vke>20 && vke<25)
            System.out.println("Normal");

         else if (vke>25 && vke<=30)
             System.out.println("Kilolu");

         else if (vke>30)
             System.out.println("Obez");

         else
             System.out.println("Geçersiz Değer");



    }
}
