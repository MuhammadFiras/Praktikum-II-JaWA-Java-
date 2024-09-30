import java.util.Scanner;
public class PRAK104_2210817110014_MuhammadFiras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuRonde1 = input.next();
        String abuRonde2 = input.next();
        String abuRonde3 = input.next();

        System.out.print("Tangan Bagas: ");
        String bagasRonde1 = input.next();
        String bagasRonde2 = input.next();
        String bagasRonde3 = input.next();

        input.close();
        int poinAbu = 0;
        int poinBagas = 0;

        if (abuRonde1.equals(bagasRonde1)) {
        } else if ((abuRonde1.equals("B") && bagasRonde1.equals("G")) ||
                (abuRonde1.equals("G") && bagasRonde1.equals("K")) ||
                (abuRonde1.equals("K") && bagasRonde1.equals("B"))) {
            poinAbu++;
        } else {
            poinBagas++;
        }
        if (abuRonde2.equals(bagasRonde2)) {
        } else if ((abuRonde2.equals("B") && bagasRonde2.equals("G")) ||
                (abuRonde2.equals("G") && bagasRonde2.equals("K")) ||
                (abuRonde2.equals("K") && bagasRonde2.equals("B"))) {
            poinAbu++;
        } else {
            poinBagas++;
        }

        if (abuRonde3.equals(bagasRonde3)) {
        } else if ((abuRonde3.equals("B") && bagasRonde3.equals("G")) ||
                (abuRonde3.equals("G") && bagasRonde3.equals("K")) ||
                (abuRonde3.equals("K") && bagasRonde3.equals("B"))) {
            poinAbu++;
        } else {
            poinBagas++;
        }

        if (poinAbu > poinBagas) {
        	System.out.println ("Abu yang menang");
        }else if (poinBagas > poinAbu) {
            System.out.println ("Bagas yang menang");
 		}else {
 			System.out.println ("Seri");
        }
    }
}            

        

