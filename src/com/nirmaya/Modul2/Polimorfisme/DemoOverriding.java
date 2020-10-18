package com.nirmaya.Modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Mati listrik");
        subClass.getValue("Mati lampu");
    }
}
