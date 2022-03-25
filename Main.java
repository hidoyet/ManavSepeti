package manavSepeti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlýcan=5.00,toplamTutar ;
		int alinanElmaKg,alinanArmutKg,alinanDomatesKg,alinanMuzKg,alinanPatlýcanKg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kaç kg armut aldýnýz?");
		alinanArmutKg=scanner.nextInt();
		System.out.println("Kaç kg elma aldýnýz?");
		alinanElmaKg=scanner.nextInt();
		System.out.println("Kaç kg domates aldýnýz?");
		alinanDomatesKg=scanner.nextInt();
		System.out.println("Kaç kg muz aldýnýz?");
		alinanMuzKg=scanner.nextInt();
		System.out.println("Kaç kg patlýcan aldýnýz?");
		alinanPatlýcanKg=scanner.nextInt();
		toplamTutar=(elma*alinanElmaKg)+(armut*alinanArmutKg)+(domates*alinanDomatesKg)+(muz*alinanMuzKg)+(patlýcan*alinanPatlýcanKg);
		System.out.println("Toplam alýþveriþ tutarý: " + toplamTutar + "TL dir");
	}

}
