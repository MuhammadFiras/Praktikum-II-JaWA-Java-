package soal2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");

        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan != 1 && pilihan != 2) {
            throw new IllegalArgumentException("Pilihan hanya 1 dan 2");
        } else {
            dataHewanPeliharaan(pilihan, input);
        }

        input.close();
    }

    private static void dataHewanPeliharaan(int pilihan, Scanner input) {
        System.out.print("Nama hewan peliharaan: ");
        String n = input.nextLine();
        System.out.print("Ras: ");
        String r = input.nextLine();
        System.out.print("Warna bulu: ");
        String w = input.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(n, r, w);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Memiliki kemampuan: ");
            String kemampuan = input.nextLine();
            String[] k = kemampuan.split(", ");
            Anjing anjing = new Anjing(n, r, w, k);
            anjing.displayDetailAnjing();
        }
    }
}
