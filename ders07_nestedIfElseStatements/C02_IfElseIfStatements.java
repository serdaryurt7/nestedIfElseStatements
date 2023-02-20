package ders07_nestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunAdet = 30;
        boolean musteriKartiVarMi = false;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        if (musteriKartiVarMi && urunAdet>=10)
        {
        toplamFiyat = urunAdet * listeFiyati*(0.8);
            System.out.println("Müşteri Kartı ile %20 indirimli toplam fiyat: " + toplamFiyat);
        }
        else if (musteriKartiVarMi && urunAdet>0 && urunAdet<10) {
            toplamFiyat = urunAdet * listeFiyati*(0.85);
            System.out.println("Müşteri Kartı ile %15 indirimli toplam fiyat: " + toplamFiyat);
        }
        else if (!musteriKartiVarMi && urunAdet>=10) {
            toplamFiyat = urunAdet *listeFiyati*(0.85);
            System.out.println("Müşteri Kartsız %15 indirimli toplam fiyat: " + toplamFiyat);
        }
        else if (!musteriKartiVarMi && urunAdet<10 && urunAdet>0) {
            toplamFiyat = urunAdet *listeFiyati*(0.90);
            System.out.println("Müşteri Kartsız %10 indirimli toplam fiyat: " + toplamFiyat);
        }
        else {
            System.out.println("Geçersiz Giriş");
        }

    }
}
