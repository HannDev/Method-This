package MethodThis;

import Method.Method;

public class MethodThisMain {
    public static void main(String[] args) {

                //PROCEDURE

        MethodThis NamaVariabel2 = new MethodThis();
        NamaVariabel2.NamaVariabel("Nama      : Rohman Abdul Hani");
        System.out.println(NamaVariabel2.nama);

        MethodThis X2 = new MethodThis();
        X2.X("Umur      : 17 tahun");
        System.out.println(X2.umur);

        MethodThis A2 = new MethodThis();
        A2.A("Jurusan   : Programmmer");
        System.out.println(A2.jurusan);

        MethodThis B2 = new MethodThis();
        B2.B("Divisi    : Android Developer");
        System.out.println(B2.divisi);

        MethodThis C2 = new MethodThis();
        C2.C("Asal      : Magelang");
        System.out.println(C2.asal);



                //FUNGSI

         int TotalBarang = NamaVariabel2.JumlahBarang(10,20);
        System.out.println("Total semuanya adalah "+TotalBarang+" Barang");

        int TotalUmur = NamaVariabel2.JumlahUmur(20,8);
        System.out.println("Jadi total umur mereka adalah "+TotalUmur+" Tahun");

    }
}
