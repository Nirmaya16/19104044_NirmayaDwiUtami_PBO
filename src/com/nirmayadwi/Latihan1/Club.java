package com.nirmayadwi.Latihan1;

public class Club {
    public String name;
    public int year;
    public String stadion;
    public int champion;
    public String description;

    //buat Constructor pertama tanpa parameter
    public Club() {}

    // constructor kedua dengan parameter tipe data String
    public Club(String name) {
        this.name = name;
    }

    // constructor ketiga dengan parameter tipe data String
    public Club(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // constructor keempat dengan parameter tipe data String, dan int
    public Club(String name, int year, String stadion) {
        this.name = name;
        this.year = year;
        this.stadion = stadion;
    }

    // constructor kelima dengan paramater tipe data String dan int
    public Club(String name, int year, String stadion, int champion, String description) {
        this.name = name;
        this.year = year;
        this.stadion = stadion;
        this.champion = champion;
        this.description = description;
    }

    //panggil Method getTeam
    public void getTeam(){
        System.out.println("Club\t\t\t: " + name);
        System.out.println("Since\t\t\t: " + year);
        System.out.println("Stadium\t\t\t: " + stadion);
        System.out.println("UCL Champion\t: " + champion);
        System.out.println("Description\t\t: " + description);
    }
}
