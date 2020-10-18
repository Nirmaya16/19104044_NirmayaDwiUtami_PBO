package com.nirmayadwi.Latihan3;

public class Mahasiswa extends Pacar{
    public String nama = "Nirmaya";
    public String status = "Kuliah sambil rebahan";
    public int semester = 3;

    public void getStatus() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Status\t\t\t: " + status);
        System.out.println("Semester\t\t: " + semester);
    }
}
