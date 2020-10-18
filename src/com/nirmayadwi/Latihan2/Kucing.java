package com.nirmayadwi.Latihan2;

public class Kucing extends Binatang{
    //Dekarasi variabel awal
    public String namaKucing;

    //Constructor dengan parameter String
    public Kucing(String namaKucing) {
        this.namaKucing = namaKucing;
    }

    //panggil Method getName dari class Binatang
    @Override
    public void getName() {
        System.out.println("Nama Kucing\t\t: " + namaKucing);
    }

    //Method
    public void getVoice(){
        System.out.println(namaKucing + " miaww miaww miaww");
    }
}
