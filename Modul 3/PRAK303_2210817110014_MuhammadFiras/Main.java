package PRAK303_2210817110014_MuhammadFiras;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <Mahasiswa> daftarMahasiswa = new ArrayList <>();
		
		while (true) {
			System.out.println("Menu : ");
			System.out.println("1. Tambah Mahasiswa");
			System.out.println("2. Hapus Mahasiswa");
			System.out.println("3. Cari Mahasiswa");
			System.out.println("4. Tampilkan Daftar Mahasiswa");
			System.out.println("0. Keluar");
			System.out.print("Pilihan : ");
			int menu = input.nextInt();
			input.nextLine();
			
			if (menu == 1) {
				System.out.print("Masukkan Nama Mahasiswa : ");
				String nama = input.nextLine();
				System.out.print("Masukkan NIM Mahasiswa : ");
				String nim = input.nextLine();
				
				Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
				
				daftarMahasiswa.add(mahasiswa);
				
				System.out.println("Mahasiswa " + mahasiswa.getNama() + " Ditambahkan.");
			}
			
			else if (menu == 2) {
				System.out.print("Masukkan NIM Mahasiswa yang akan dihapus : ");
				String nim = input.nextLine();
				Mahasiswa mahasiswaDihapus = null;
				
				for (Mahasiswa mhs : daftarMahasiswa) {
					if (mhs.getNim().equals(nim)) {
						mahasiswaDihapus = mhs;
						break;
					}
				}
				
				if (mahasiswaDihapus != null) {
					daftarMahasiswa.remove(mahasiswaDihapus);
					System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
				}
				else {
					System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
				}
			}
			
			else if (menu == 3) {
				System.out.println("Masukkan NIM Mahasiswa yang akan dicari: ");
				String nim = input.nextLine();
				
				for (Mahasiswa mhs : daftarMahasiswa) {
					if (mhs.getNim().equals(nim)) {
						System.out.println("Data Mahasiswa : ");
						System.out.println("Nama : " + mhs.getNama());
						System.out.println("NIM : " + mhs.getNim());
						break;
					}
				}
			}
			
			else if (menu == 4) {
				System.out.println("Seluruh Data Mahasiswa : ");
				
				for (Mahasiswa mhs : daftarMahasiswa) {
					System.out.println("NIM : " + mhs.getNim() +", Nama : " + mhs.getNama());
				}
			}
			
			else if (menu == 0) {
				daftarMahasiswa.clear();
				System.out.println("Terima Kasih!");
				break;
			}
			
			else {
				System.out.println("Menu tidak valid. Silahkan pilih menu yang benar.");
			}
		}
	}
}
