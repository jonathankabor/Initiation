package Utilitaires;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Saisie {

	
	public enum TypeSaisie{Chaine, Prix, Quantite, Date };
	
	public static Object Saisir (TypeSaisie type, String invite)
	{

		//Initialisation du Scanner
		Scanner scan = new Scanner(System.in);
		String strSaisie;
		
		//Affichage de l'invite initiale
		System.out.println(invite);
		
		do {
			strSaisie = scan.nextLine();
			

			
			
			
			switch (type) {
			case Chaine:
				if (strSaisie.length()<=30) {
					return strSaisie;
				}else {
					System.out.println("Saisir une chaine de moins de 30 car...");
				}
				break;
			case Prix:
				try {
					Double dblPrix=Double.parseDouble(strSaisie);
					if (dblPrix>0) {
						return dblPrix;
					}else {
						System.out.println("Saisir un prix positif...");
					}
				} catch (Exception e) {
					System.out.println("Saisir un prix...");
				}
				break;
			case Quantite:
				try {
					Integer intQte=Integer.parseInt(strSaisie);
					if (intQte>0 && intQte<=100) {
						return intQte;
					}else {
						System.out.println("Saisir une quantite entre 1 et 100...");
					}
				} catch (Exception e) {
					System.out.println("Saisir une quantite entiere...");
				}
				break;
			case Date:
				try {
					LocalDate date=LocalDate.parse(strSaisie);
					if (date.compareTo(LocalDate.now())>0) {
						return date;
					}else {
						System.out.println("Saisir une date posterieure aujourd'hui...");
					}
				} catch (Exception e) {
					System.out.println("Saisir une date...");
				}
				break;

			default:
				break;
			}
			
			
			
		} while (true);
	}
	
}



