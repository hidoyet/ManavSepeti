package manavSepeti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patl�can=5.00,toplamTutar ;
		int alinanElmaKg,alinanArmutKg,alinanDomatesKg,alinanMuzKg,alinanPatl�canKg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ka� kg armut ald�n�z?");
		alinanArmutKg=scanner.nextInt();
		System.out.println("Ka� kg elma ald�n�z?");
		alinanElmaKg=scanner.nextInt();
		System.out.println("Ka� kg domates ald�n�z?");
		alinanDomatesKg=scanner.nextInt();
		System.out.println("Ka� kg muz ald�n�z?");
		alinanMuzKg=scanner.nextInt();
		System.out.println("Ka� kg patl�can ald�n�z?");
		alinanPatl�canKg=scanner.nextInt();
		toplamTutar=(elma*alinanElmaKg)+(armut*alinanArmutKg)+(domates*alinanDomatesKg)+(muz*alinanMuzKg)+(patl�can*alinanPatl�canKg);
		System.out.println("Toplam al��veri� tutar�: " + toplamTutar + "TL dir");
	}

}
