package Folder_Praktikum_2.PRAK202_2210817110014_MuhammadFiras;

public class Kopi {
	String namaKopi;
	String namaPembeli;
	String ukuran;
	double harga;
	double pajak = 0.11;
	
	void info() {
		System.out.println("Nama kopi: " + namaKopi);
		System.out.println("Ukuran : " + ukuran);
		System.out.println("Harga : Rp." + harga);
	}
	
	void setPembeli(String namaPembeli1) {
		namaPembeli = namaPembeli1;
	}
	
	String getPembeli() {
		return namaPembeli;
	}
	
	double getPajak() {
		return harga * pajak;
	}

}
