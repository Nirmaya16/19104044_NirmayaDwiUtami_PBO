package com.nirmayadwi.Latihan2;

public class Ikan extends Binatang{
    //deklarasi variabel awal
    public String namaIkan;

    //Constructor dengan parameter String
    public Ikan(String namaIkan) {
        this.namaIkan = namaIkan;
    }

    //panggil Method getName dari class Binatang
    @Override
    public void getName() {
        System.out.println("Jenis Ikan\t\t: " + namaIkan);
    }

    //Method
    public void getSwim() {
        System.out.println(namaIkan + " blablaaa");
        System.out.println();
    }
}
