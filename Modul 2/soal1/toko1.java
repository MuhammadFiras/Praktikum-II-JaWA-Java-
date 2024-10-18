package PRAK201_2210817110014_MuhammadFiras;

class toko1 {
	String nama;
	double berat;
	double harga; 
	double jumlahBeli; 
	double sebelumDiskon; 
	double totalDiskon;
	double setelahDiskon; 
	//berat dan jumlahBeli dlm kg
	
	public toko1 (String nama, double berat, double harga, double jumlahBeli) {
		this.nama = nama;
		this.berat = berat;
		this.harga = harga;
		this.jumlahBeli = jumlahBeli;
		this.sebelumDiskon = jumlahBeli / berat * harga;
		double kelipatan = this.jumlahBeli >= 4 ? this.jumlahBeli / 4 : 0.0;
		this.totalDiskon = 0.02 * (4 * this.harga) * Math.floor(kelipatan);
		this.setelahDiskon = this.sebelumDiskon - this.totalDiskon;
	}
	
	public void display() {
		System.out.println("Nama Buah: " + this.nama);
        System.out.println("Berat: " + this.berat);
        System.out.println("Harga: " + this.harga);
        System.out.printf("Jumlah Beli: %.1fkg\n", this.jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f \n", this.sebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", this.totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", this.setelahDiskon);
        System.out.println();
	}

}
