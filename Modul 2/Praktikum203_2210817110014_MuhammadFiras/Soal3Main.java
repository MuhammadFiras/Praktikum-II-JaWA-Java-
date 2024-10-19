package Praktikum2.PRAK203_2210817110014_MuhammadFiras;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris dibawah error karena tdk ada ; diakhir
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Pada baris ini salah karena tidak ada deklarasi umur agar hasil sesuai dengan output, harusnya ia ada disini
        //(tidak ada baris jadi tidak sesuai output)
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris dibawah tidak sesuai output, harusnya ada tambahan tahun di akhir outputnya
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
