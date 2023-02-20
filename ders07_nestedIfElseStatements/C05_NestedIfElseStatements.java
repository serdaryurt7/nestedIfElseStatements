package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunAdet = 30;
        boolean kartiVarMi = false;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        //ana değişken kart

        if (kartiVarMi ) {
            // kart var

            if (urunAdet < 0) {
                System.out.println("Hatalı Ürün Adedi");
            } else if (urunAdet < 10) {
                toplamFiyat = urunAdet * listeFiyati * (0.85);
                System.out.println("Müşteri Kartı ile %15 indirimli toplam fiyat: " + toplamFiyat);
            } else {
                toplamFiyat = urunAdet * listeFiyati * (0.8);
                System.out.println("Müşteri Kartı ile %20 indirimli toplam fiyat: " + toplamFiyat);
            }
        }
        else {

            if (urunAdet<0){
                System.out.println("Hatalı Ürün Adedi");
            } else if (urunAdet<10) {
                toplamFiyat = urunAdet * listeFiyati*(0.90);
                System.out.println("Müşteri Kartı olmadan %10 indirimli toplam fiyat: " + toplamFiyat);
            }
            else{
                toplamFiyat = urunAdet * listeFiyati*(0.85);
                System.out.println("Müşteri Kartı olmadan %15 indirimli toplam fiyat: " + toplamFiyat);
            }

            }

        }

    }
