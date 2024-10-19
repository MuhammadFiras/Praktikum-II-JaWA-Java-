package Praktikum2.PRAK203_2210817110014_MuhammadFiras;
//Pada baris ini ada error karena harusnya class namanya sama dengan nama file
//public class Employee {
public class Pegawai {
	public String nama; 
	//disini variable asal beda jenis dengan yg di main jadi error, harusnya String
	//public char asal;
	public String asal;
	public String jabatan; 
	public int umur;
	
	public String getNama() { 
		return nama;
	}
	
	public String getAsal() { 
		return asal;
	}
	//Pada baris ini error di variabel j dibawahnya karena harusnya variabel j di deklarasikan dulu di nama fungsi
	//public void setJabatan() {
	public void setJabatan(String j) {
		this.jabatan = j;
	}
}
