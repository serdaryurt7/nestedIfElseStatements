package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {
        // Kullanıcıdan cinsiyetini ve yaşını alın, Kadın, 60 yaş ve üzeri,
        //Erkek 65 yaş ve üzeri emekli olabilir.
        // Cinsiyet ve yaşını dikkate alarak
        // "Emekli Olabilirsin" veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın.

        // (iç-içe if-else)Nested if-else şeklinde kullanım için önce ana değişkeni seçip ona göre ana yapıyı oluşturalım.
        //Cinsiyet ana değişkenimiz olsun.


        char cinsiyet = 'K';
        int yas = 56;

        if (cinsiyet == 'k' || cinsiyet =='K'){

            if (yas<15){
                System.out.println("Hatalı Yaş Girişi");
            } else if (yas<60) {
                System.out.println("Emekli olabilmek için " + (60-yas) + " yıl çalışman lazım");
            }
            else {
                System.out.println("Emekli olabilirsin");
            }


        } else if (cinsiyet =='e' || cinsiyet =='E') {

            if (yas<15){
                System.out.println("Hatalı Yaş Girişi");
            } else if (yas<65) {
                System.out.println("Emekli olabilmek için " + (65-yas) + " yıl çalışman lazım");
            }
            else {
                System.out.println("Emekli olabilirsin");
            }
        }

        else {
            System.out.println("Yanlış Giriş");
        }


    }
}
