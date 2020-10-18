package com.nirmayadwi.Latihan2;

public class Burung extends Binatang{
    //deklarasi variabel awal
    public String namaBurung;

    //Constructor dengan parameter String
    public Burung(String namaBurung) {
        this.namaBurung = namaBurung;
    }

    //panggil Method getName dari class Binatang
    @Override
    public void getName() {
        System.out.println("Jenis Burung\t: " + namaBurung);
    }

    //Method
    public void getFly(){
        System.out.println("Mengepakkan kedua sayap dan Terbang tinggi di angkasa");
        System.out.println();
    }
}
