package com.nirmayadwi.Latihan2;

public class DemoBinatang {
    public static void main(String[] args) {
        System.out.println("--------Konsep Inheritance pada Binatang--------");
        Burung $burung = new Burung("Kelelawar");
        $burung.getName();
        $burung.getHabit("Buah-buahan", "Siang hari");
        $burung.getFly();

        Ikan $ikan = new Ikan("Nemo");
        $ikan.getName();
        $ikan.getHabit("Mini plankton", "Terumbu Karang");
        $ikan.getSwim();

        Kucing $kucing = new Kucing("Cleo");
        $kucing.getName();
        $kucing.getHabit("Royal canin", "Keranjang");
        $kucing.getVoice();
    }
}
