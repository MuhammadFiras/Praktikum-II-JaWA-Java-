package PRAK301_2210817110014_MuhammadFiras;

import java.util.Random;

public class Dadu {
	private int nilai;
	
	public Dadu() {
		acakNilai();
	}
	
	public void acakNilai() {
		Random acak = new Random();
		nilai = acak.nextInt(6) + 1;
	}
	
	public int getNilai() {
		return nilai;
	}

}
