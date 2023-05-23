package Taksimetre;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int km, startPrice = 10;
		double kmFiyat = 2.20, total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("TAKSİMETRE");
		System.out.print("Mesafeyi KM cinsinden yazınız: ");
		km = input.nextInt();
		
		total = (kmFiyat * km);
		total += startPrice;
		total = total < 20 ? 20 : total;
		
		System.out.print("Toplam tutar: " + total + " TL");
		

	}

}
