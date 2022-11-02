package manavSepeti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pearPrice=2.14,applePrice=3.67,tomatoPrice=1.11,bananaPrice=0.95,auberginePrice=5.00,totalPrice ;
		double appleAmount,pearAmount,tomatoAmount,bananaAmount,aubergineAmount;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kaç kg armut aldınız?");
		pearAmount=scanner.nextDouble();
		System.out.println("Kaç kg elma aldınız?");
		appleAmount=scanner.nextDouble();
		System.out.println("Kaç kg domates aldnız?");
		tomatoAmount=scanner.nextDouble();
		System.out.println("Kaç kg muz aldınız?");
		bananaAmount=scanner.nextDouble();
		System.out.println("Kaç kg patlıcan aldınız?");
		aubergineAmount=scanner.nextDouble();
		totalPrice=(applePrice*appleAmount)+(pearPrice*pearAmount)+(tomatoPrice*tomatoAmount)+(bananaPrice*bananaAmount)+(auberginePrice*aubergineAmount);
		System.out.println("Toplam alışveriş tutarı: " + totalPrice + "TL'dir");
	}

}
