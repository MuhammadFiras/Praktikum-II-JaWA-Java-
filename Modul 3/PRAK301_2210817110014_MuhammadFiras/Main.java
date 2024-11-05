package PRAK301_2210817110014_MuhammadFiras;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int jumlahDadu = input.nextInt();
		
		LinkedList <Dadu> dadulist = new LinkedList<>();
		
		for (int i = 1; i <= jumlahDadu; i++) {
			Dadu dadu = new Dadu();
			dadulist.add(dadu);
			System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
		}
		
		int totalNilai = 0;
		for (Dadu dadu : dadulist) {
			totalNilai += dadu.getNilai();
		}
		
		System.out.println("Total nilai dadu secara keseluruhan : " + totalNilai);
		input.close();
	}
}
