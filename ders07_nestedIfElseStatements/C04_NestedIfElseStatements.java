package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        // Kullanıcıdan cinsiyetini ve yaşını alın, Kadın, 60 yaş ve üzeri,
        //Erkek 65 yaş ve üzeri emekli olabilir.
        // Cinsiyet ve yaşını dikkate alarak
        // "Emekli Olabilirsin" veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        double yas = scanner.nextDouble();

        System.out.println("Lütfen cinsiyetinizi giriniz E/K ");
        char cinsiyet = scanner.next().charAt(0);

        if (yas<15){
            System.out.println("Geçersiz yaş girişi");
        } else if (yas<60) {

            if (cinsiyet == 'k' || cinsiyet == 'K')
            {
                System.out.println("Emekli olabilmek için " + (60-yas) + " yıl çalışman lazım");
            }

            else if (cinsiyet == 'e' || cinsiyet == 'E')
            {
                System.out.println("Emekli olabilmek için " + (65-yas) + " yıl çalışman lazım");
            }
            else {
                System.out.println("Hatalı Giriş");
            }


        } else if (yas<65) {

            if (cinsiyet == 'k' || cinsiyet == 'K')
            {
                System.out.println("Emekli olabilirsin");
            }

            else if (cinsiyet == 'e' || cinsiyet == 'E')
            {
                System.out.println("Emekli olabilmek için " + (65-yas) + " yıl çalışman lazım");
            }
            else {
                System.out.println("Hatalı Giriş");
            }

        }
        else {
            System.out.println("Emekli olabilirsin");
        }

    }
}
