package com.nirmaya.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Kamu yang kutunggu");
        Lagu lagu2 = new Lagu("Seperti Kemarin", "Noah");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
