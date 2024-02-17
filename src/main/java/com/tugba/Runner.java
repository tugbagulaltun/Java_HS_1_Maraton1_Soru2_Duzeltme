package com.tugba;

public class Runner {
    public static void main(String[] args) {
        CustomStringTr customStringTr= new CustomStringTr();

        System.out.println("Karakteri Yazdır...............: " + customStringTr.karakterYazdir(6));
        System.out.println("Son Rastlanan Konumu...........: " + customStringTr.sonRastlananKonumu("a"));
        System.out.println("Karakter Alma .................: " + customStringTr.istenilenKadarKarakterAlma(0,5));
        System.out.println("Başlangıç Değeri Kontrol Et....: " + customStringTr.baslayipBaslamadiginiKontrolEt("B"));
        System.out.println("İfade Boş Mu Dolu Mu...........: " + customStringTr.ifadeBosMuDoluMu());
        System.out.println("Boslukları Dil.................: " + customStringTr.bosluklariSil());
        System.out.println("Değişiklik Yap.................: " + customStringTr.degisiklikYap("u","ü"));
        System.out.println("Büyük Harfe Çevir..............: " + customStringTr.buyukHarfeCevir());
        System.out.println("Küçük Harfe Çevir..............: " + customStringTr.kucukHarfeCevir());
        System.out.println("Değer Arama....................: " + customStringTr.karakterYaDaStringDegerAra("maraton"));
        System.out.println("İfade Dolu Mu..................: " + customStringTr.ifadeDoluMu());
        System.out.println("İfade Birleştirme..............: " + customStringTr.ifadeleriBirlestir("tugba"));

    }

}
