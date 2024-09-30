import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2210817110014_MuhammadFiras {

    public static void main(String[] args){
        //--deklarasi variabel dan scanner
        Scanner input = new Scanner(System.in);
        double r, t, phi, volume;
        
        //--deskripsi
        phi = 3.14;
        
        //--input
        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();
        
        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();
        
        input.close();
        
        //--menghitung volume
        volume = phi * r * r * t;
        DecimalFormat df = new DecimalFormat("#.###");
        //-Output
        System.out.print("Volume tabung dengan jari-jari " + r +" cm dan ");
        System.out.print("tinggi " + t +" cm adalah " + df.format(volume) + " m3 ");
    }
}

