package PRAK201_2210817110014_MuhammadFiras;

public class Main {
	public static void main(String[] args) {
        toko1 apel = new toko1("Apel", 0.4, 7000.0, 40.0);
        toko1 mangga = new toko1("Mangga", 0.2,3500.0, 15.0);
        toko1 alpukat = new toko1("Alpukat", 0.25, 10000.0, 12.0);
        apel.display();
        mangga.display();
        alpukat.display();
    }
}
