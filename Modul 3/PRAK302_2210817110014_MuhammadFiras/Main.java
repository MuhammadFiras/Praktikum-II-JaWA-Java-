package PRAK302_2210817110014_MuhammadFiras;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		int jumlahNegara = input.nextInt();
		input.nextLine();
		
		LinkedList <Negara> negaralist = new LinkedList<>();
		
		HashMap <Integer, String> namaBulan = new HashMap<>();
		namaBulan.put(1, "Januari");
		namaBulan.put(2, "Februari");
		namaBulan.put(3, "Maret");
		namaBulan.put(4, "April");
		namaBulan.put(5, "Mei");
		namaBulan.put(6, "Juni");
		namaBulan.put(7, "Juli");
		namaBulan.put(8, "Agustus");
		namaBulan.put(9, "September");
		namaBulan.put(10, "Oktober");
		namaBulan.put(11, "November");
		namaBulan.put(12, "Desember");
		
		for (int i = 0; i < jumlahNegara; i++) {
			String namaNegara = input.nextLine();
			String jenisKepemimpinan = input.nextLine();
			String namaPemimpin = input.nextLine();
			
			int tanggalKemerdekaan = 0;
			int bulanKemerdekaan = 0;
			int tahunKemerdekaan = 0;
			
			if(!jenisKepemimpinan.equals("monarki")) {
				tanggalKemerdekaan = input.nextInt();
				bulanKemerdekaan = input.nextInt();
				tahunKemerdekaan = input.nextInt();
				input.nextLine();
			}
			
			Negara negara = new Negara (namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
			negaralist.add(negara);
			
		}
		
		for(Negara negara : negaralist) {
			if (negara.getJenisKepemimpinan().equals("monarki")) {
				System.out.println("Negara " + negara.getNamaNegara() + " mempunyai " + 
				(negara.getJenisKepemimpinan().equals("monarki") ? "Raja" : "Sultan")
				+ " bernama " + negara.getNamaPemimpin() + "\n");
			} 
			
			else {
				System.out.println("Negara " + negara.getNamaNegara() + " mempunyai " + 
				(negara.getJenisKepemimpinan().equals("Presiden") ? "Presiden" : "Perdana Menteri")
				+ " bernama " + negara.getNamaPemimpin() + "\n"+ "Deklarasi Kemerdekaan pada Tanggal " + 
				negara.getTanggalKemerdekaan() + " " + namaBulan.get(negara.getBulanKemerdekaan()) 
				+ " " + negara.getTahunKemerdekaan() + "\n");
			}
		
		}

	}

}
