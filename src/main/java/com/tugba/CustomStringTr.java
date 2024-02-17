package com.tugba;

public class CustomStringTr {

    private String ifade = "   Bugün maratonda 1 tane test sorusu, 3 tane klasik soru bulunmaktadır.   ";


    public char karakterYazdir(int index) {
        return getIfade().charAt(index); // String değeri içindeki 6. indexte bulunan karakterin çıktısını verir. m çıktısını verecek.
    }

    public int sonRastlananKonumu(String karakter) {
        return getIfade().lastIndexOf(karakter); // String ifadede karakter değişkeninin son rastlanan konumunu verir.
    }

    public String istenilenKadarKarakterAlma(int baslangicIndex, int bitisIndex) {
        return getIfade().substring(baslangicIndex, bitisIndex); // burada maraton kelimesini yazdırmak için baslangicIndex indexten başlayıp bitisIndex indexe kadar karakterleri aldım.
    }

    public Boolean baslayipBaslamadiginiKontrolEt(String deger) {
        return getIfade().startsWith(deger);
    }

    public Boolean ifadeBosMuDoluMu() {
        return getIfade().isEmpty(); // ifadenin içeriğinin boş mu dolu mu olduğuna bakar.
    }

    public String bosluklariSil() {
        return getIfade().trim(); // ifadenin başında ve sonunda bulunan boşlukları siler. Ara boşluklara karışmaz.
    }

    public String degisiklikYap(String degistirilecekKarakter, String istenenKarakter) {
        return getIfade().replace(degistirilecekKarakter, istenenKarakter); // String ifadedeki Bugün kelimesinde bulunan u harfini ü harfine döndürür.
    }

    public String buyukHarfeCevir() {
        return getIfade().toUpperCase(); // String değerindeki her karakteri büyük harfle yazar.
    }

    public String kucukHarfeCevir() {
        return getIfade().toLowerCase(); // String değerindeki her karakteri küçük harfle yazar.
    }

    public int karakterYaDaStringDegerAra(String aranacakDeger) {
        return getIfade().indexOf(aranacakDeger); // String değerde test kelimesini arar.
    }

    public Boolean ifadeDoluMu() {
        return getIfade().isBlank(); // isEmpty'den farkı ifade3= " "; ifadesini true döndürür.
    }

    public String ifadeleriBirlestir(String birlestirme) {
        return getIfade().concat(birlestirme);

    }

//***** getter ve setter ******
    public String getIfade() {
        return ifade;
    }

    public void setIfade(String ifade) {
        this.ifade = ifade;
    }


}
