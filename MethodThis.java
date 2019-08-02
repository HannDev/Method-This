package MethodThis;

public class MethodThis {

            //PROCEDURE


     String nama;
     void NamaVariabel (String nama) {
        this.nama = nama;
     }

     String umur;
     void X (String umur) {
        this.umur = umur;
     }

     String jurusan;
     void A (String jurusan) {
         this.jurusan = jurusan;
     }

     String divisi;
     void B (String divisi) {
         this.divisi = divisi;
     }

     String asal;
     void C (String asal) {
         this.asal = asal;
     }


            //FUNGSI

     int JumlahBarang(int BarangMasuk, int BarangKeluar) {
         int JumlahBarang = BarangMasuk + BarangKeluar;
                 return JumlahBarang;
     }

     int JumlahUmur (int UmurRohman, int UmurHasna) {
         int JumlahUmur = UmurRohman + UmurHasna;
            return JumlahUmur;
     }


}
