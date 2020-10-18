package com.nirmayadwi.Latihan1;

public class DemoClub {
    public static void main(String[] args) {
        //buat object baru
        Club first = new Club(); //Object kosongan
        Club second = new Club("Everton"); //Object dengan constructor 1 parameter
        Club third = new Club("FC Barcelona", "Mes Que Un Club"); //2 parameter
        Club fourth = new Club("Juventus", 1897, "Allianz Stadium"); //3 parameter
        Club fifth = new Club("Manchester United", 1878, "Old Trafford", 10,"it is about hopes and dreams"); //5 parameter

        //Output
        first.getTeam();
        second.getTeam();
        third.getTeam();
        fourth.getTeam();
        fifth.getTeam();
    }
}

