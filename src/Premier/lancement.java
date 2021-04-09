package Premier;

import static java.lang.System.out;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import Assurance.AssuHabitation;
import Assurance.AssuVoiture;
import Assurance.ContratAssurance;
import Automobile.Camion;
import Automobile.Moto;
import Automobile.Voiture;
import Automobile.V�hicule;
import Banque.CompteEpargne;
import Banque.Pret;
import Douleur.Aspirine;
import Douleur.IAntalgique;
import Douleur.Ibuprof�ne;
import Douleur.Paracetamol;
import POE.Ordinateur;
import POE.Stagiaires;
import Artisanat.Devis;
import Artisanat.Devis.TypeConseil;
import Artisanat.Prestation;

public class lancement {

	//Proc�dure principale lanc�e � l'ex�cution de cette classe
	
	public static void main(String[] args) {
		
	//Utilisation d'une classe fa�te maison
		
		//DemoCompteEpargne();
		
		//DemoStagiaire();
		
		//DemoPret();		
		
		//Initialisation d'un entier
		
		//DemoPassageValeur();
		
		//DemoAppelAttributs();
		
		//DemoEnum();
		
		//DemoCondition();
		
		//DemoSaisie();
		
		//ExerciceConditions();
		
		//DemoOperateurs();
		
		//DemoOperateurConditionel();
		
		//DemoConditionsSwitch();
		
		//ExerciceSwitch();
		
		//DemoFor();
		
		//DemoWhile();
		
		//DemoWhile2();
		
		//JeuDuNombreSecret();
		
		//DemoIterationForEach();
		
		//DemoTableauCompteEpargne();
		
		//DemoHeritage();
		
		//DemoInterface();
		
		//DemoAbstract();
		
		//TesterDevis();
		
		TesterDevisEtPrestations();
		
		
		
		
	}	
	
		
		
	
	
		
	private static void TesterDevisEtPrestations() {
		
		Devis devis = new Devis(LocalDate.of(2021, 4, 5));
		
		Prestation p1 = new Prestation(LocalDate.of(2021, 4, 5),12, 15, "Fourniture parquet");
		Prestation p2 = new Prestation(LocalDate.of(2021, 4, 5),20, 20, "Fourniture colle");
		Prestation p3 = new Prestation(LocalDate.of(2021, 4, 5), TypeConseil.Peinture);
		
		devis.AjouterMarchandises(p1);
		devis.AjouterMarchandises(p2);
		devis.AjouterConseil(p3);
		
		out.println("d�tails du devis : ");
		
		for (Prestation  p : devis.getDetails()) {
			out.println(p.strDescription);
			
		}
		
		out.println(devis.getMontantDevis());
		
	}






	private static void TesterDevis() {
			
			
			//instanciation avec dates
			Devis devisA = new Devis(LocalDate.of(2021, 4, 5));
			Devis devisB = new Devis(LocalDate.of(2021, 4, 8));
			
			devisA.AjouterConseil(TypeConseil.Sol, LocalDate.of(2021, 4, 12));
			devisA.AjouterMarchandises(15, 15.99);
			devisA.AjouterMarchandises(4, 20.99);
			devisA.AjouterHonoraires(8, 47);
			
			
			devisB.AjouterConseil(TypeConseil.Sol, LocalDate.of(2021, 4, 10));
			devisB.AjouterMarchandises(15, 20.99);
			devisB.AjouterMarchandises(40, 25.49);
			devisB.AjouterMarchandises(7, 20.99);
			devisB.AjouterHonoraires(4, 40);
			devisB.AjouterHonoraires(18, 47);
			
			
			out.println("devis A : " + devisA.getMontantDevis());
			out.println("devis B : " + devisB.getMontantDevis());
		

		
	}



	private static void DemoAbstract() {
		
		
		ContratAssurance assurances[] = {
				
				new AssuHabitation(),
				new AssuHabitation(),
				new AssuVoiture(),
				new AssuHabitation(),
				new AssuHabitation(),
				new AssuVoiture(),
				new AssuVoiture(),
				new AssuVoiture(),
				new AssuVoiture()
		};
		
		for (ContratAssurance contrat : assurances) {
			
			contrat.Signer();
			contrat.Rembourser();
			contrat.Resilier();
			
		}
		
	}

	private static void DemoInterface() {
		
		IAntalgique antalgiques[] = {
				
				new Aspirine(),
				new Ibuprof�ne(),
				new Aspirine(),
				new Ibuprof�ne(),
				new Paracetamol()
		};
		
		VisualiserAntalgique(antalgiques);
		
		
		
	}

	private static void VisualiserAntalgique(IAntalgique[] antalgiques) {
		for (IAntalgique anta : antalgiques) {
			
			anta.Administrer();
			anta.Soulager(5);
			
			out.println(anta.getDouleur());
			
		}
		
		
	}

	private static void DemoHeritage() {
		
		V�hicule veh = new V�hicule();
		Moto motoBM = new Moto();
		Camion truck = new Camion();
		Voiture voitureTitine = new Voiture();
		
		
		veh.Accelerer(40);
		motoBM.Accelerer(40);
		truck.Accelerer(40); 
		voitureTitine.Accelerer(40);
		
		out.println("Vehicule : " + veh.getVitesse());
		out.println("Moto : " + motoBM.getVitesse());
		out.println("Camion : " + truck.getVitesse());
		out.println("Voiture : " + voitureTitine.getVitesse());
		
		
		V�hicule vehicules[] = {veh, motoBM, truck, voitureTitine};
		
		for (V�hicule v�hicule : vehicules) {
			
			v�hicule.Accelerer(55);
			
			
			out.println(v�hicule.getVitesse());
			
		}
		
		
		
	}

	private static void DemoTableauCompteEpargne() {
		
		
		//Initialisation d'un tableau
		
		CompteEpargne CE[]= {new CompteEpargne(100d),
				new CompteEpargne(200d),
				new CompteEpargne(-1000d),
				new CompteEpargne(-50d),
				new CompteEpargne(3333d),
				
		};
		
		//Faire le cumul des comptes d'�pargne dont le solde est positif
		
		Double dblCumul = 0d;
		
		for (CompteEpargne c :CE) {
			
			if (c.getSolde()>=0) {
				
				dblCumul+=c.getSolde();
			}
			
		}
		
			out.println(dblCumul);
	}

	private static void DemoIterationForEach() {
		
		
		//Initialisation d'un tableau
		
		String strPrenoms [] = {" Jonathan ", " Norhane ", " Anass ", " Ala� ", " Martin ", " Vero "};
		
		//Manipulation d'un tableau
		
		strPrenoms[5]= "Super Vero";
		
		out.println(strPrenoms[5]);
		out.println(strPrenoms.length);
	}
	

	private static void JeuDuNombreSecret() {
		
		Integer intNbSecret = (int)(Math.random() * 100);
		Integer intReponse;
		Integer intCompteur=0;
		String strMessage="Choisir un nombre entre 1 & 100";
		
		do {
			intReponse =SaisieEntier(strMessage);
			
			if (intReponse>intNbSecret) {
				strMessage =" Choisir plus petit que " + intReponse;
				
			}else if (intReponse<intNbSecret && intReponse !=0) {
				strMessage =" Choisir plus grand que " + intReponse;
				
				
			}else if (intReponse==intNbSecret) {
				strMessage =" Bravo c'est gagn� " + intCompteur + "coups";
				
			}else {
				strMessage ="Abandon....";
			}
			
			intCompteur++;
			
			
		} while (intReponse != intNbSecret && intReponse !=0);
		
		out.println(strMessage);
	}
	
	

	private static Integer SaisieEntier(String message) {
		
		//Initialisation du scanner
		Scanner scanSaisie = new Scanner(System.in);
		
		
		do {
			//Invite
			out.println(message);
			
			
			Integer intValeur;
			
			try {
				intValeur= Integer.parseInt(scanSaisie.nextLine());
				
				if (intValeur>=0 && intValeur<=100) {
					
					return intValeur;
					
				}
				
				return intValeur;
				
			} catch (Exception e) {
			
				message = "Merci de contr�ler votre saisie, un entier entre 1 et 100";
			}
			
			
		} while (true);
		
		
	}

	private static void DemoWhile2() {
		
		
		//Initialisation de scanner
		Scanner scanSaisie = new Scanner(System.in);
		
		String strNom;
		
		do{
			
		//Une seconde invite
		
		out.println("Saisir un Nom d'au moins 4 lettres");
		
		//R�cup�rer la saisie
		 strNom = scanSaisie.nextLine();
		
		}while(strNom.length()<4);
		
		out.println(" Bienvenue " + strNom);
				
		
	}

	private static void DemoWhile() {
		
			
			//Initiation pour le scanner
			Scanner scanSaisie = new Scanner(System.in);
			
			//Une invite pour l'arriv�e
			
			out.println("Saisir la date d'arriv�e ");
			
			//R�cup�rer la saisie du type du v�hicule
			String strDebut = scanSaisie.nextLine();
			
			//Une invite pour le d�but
			
			out.println("Saisir la date de d�part");
					
			//R�cup�rer la saisie du type du v�hicule
			String strFin = scanSaisie.nextLine();
			
			
			LocalDate dateDebut = LocalDate.parse(strDebut);
			LocalDate dateFin = LocalDate.parse(strFin);
			
			//D�termination de la dur�e 
			
			Integer duree = (Period.between(dateDebut, dateFin)).getDays();
			
			//Initialisation du compteur� 0
			Integer intCompteur = 0;
			
			//Inialisation du cumul
			Integer intCumul = 0;
			
			while(intCompteur<duree) {
				
				LocalDate dateJourEtudier = dateDebut.plusDays(intCompteur);
				
				if(dateJourEtudier.getDayOfWeek()== DayOfWeek.SUNDAY ||
						dateJourEtudier.getDayOfWeek()== DayOfWeek.SATURDAY) {
					
					intCumul+=70;
				}else {
					
					intCumul+=50;
				}
				
					intCompteur++;
				
			}
			
			//Afficher le cumul
			out.println(" Le cumul s'�l�ve � " + intCumul);
					
			
		}
		
	

	private static void DemoFor() {
		
		//Initiation pour le scanner
		Scanner scanSaisie = new Scanner(System.in);
		
		//Une invite pour l'arriv�e
		
		out.println("Saisir la date d'arriv�e ");
		
		//R�cup�rer la saisie du type du v�hicule
		String strDebut = scanSaisie.nextLine();
		
		//Une invite pour le d�but
		
		out.println("Saisir la date de d�part");
				
		//R�cup�rer la saisie du type du v�hicule
		String strFin = scanSaisie.nextLine();
		
		
		LocalDate dateDebut = LocalDate.parse(strDebut);
		LocalDate dateFin = LocalDate.parse(strFin);
		
		//D�termination de la dur�e 
		
		Integer duree = (Period.between(dateDebut, dateFin)).getDays();
		
		//Initialisation du compteur� 0
		Integer intCompteur = 0;
		
		//Inialisation du cumul
		Integer intCumul = 0;
		
		for(int i = 0; i < duree; i++) {
			
			LocalDate dateJourEtudier = dateDebut.plusDays(i);
			
			if(dateJourEtudier.getDayOfWeek()== DayOfWeek.SUNDAY ||
					dateJourEtudier.getDayOfWeek()== DayOfWeek.SATURDAY) {
				
				intCumul+=70;
			}else {
				
				intCumul+=50;
			}
			
		}
		
		//Afficher le cumul
		out.println(" Le cumul s'�l�ve � " + intCumul);
				
		
	}

	private static void ExerciceSwitch() {
		
		
		/*
		 * A l'aide d'une syntaxe Switch, annoncer un tarif en fonction de la date du jour
		 * 
		 * 50 si nous sommes un Dimanche
		 * 15 pour le lundi
		 * 35 pour le jeudi
		 * 80 pour les autres jours
		 * 
		 */
		
		Scanner scanSaisie = new Scanner(System.in);
		
		//Etape1 - Obtenir la date du jour
		
		Date dateDuJour = new Date(2021, 2, 8);
		
		//Etape 2 - D�cision
		
		//D�clarer le tarif
		
		Double dblTarif;
		
		switch(dateDuJour.getDay()) {
		
		case 0: 
			dblTarif = 50d;
			break;
			
		case 1:
			dblTarif = 15d;
			break;
			
		case 4:
			dblTarif = 35d;
			break;
			
		default:
			dblTarif = 80d;
			
		
		}
		
		//Affichage du Tarif
		
			out.println(" Le tarif sera de " + dblTarif);
		
		
	}

	private static void DemoConditionsSwitch() {
		
		
		
				Scanner scanSaisie = new Scanner(System.in);
				
				//Une invite pour le type de v�hicule
				
				out.println("Saisir la cat�gorie du v�hicule");
				
				//R�cup�rer la saisie du type du v�hicule
				String strCategorie = scanSaisie.nextLine();
				
				//Conversion
				Integer intCateg = Integer.parseInt(strCategorie);
				
				String strMessage;
				
				switch(intCateg)
				{
				
					case 1:
						strMessage="Les d�butants sont les bienvenus";
						break;
					
					case  2:
						strMessage="Les amateurs doivent faire mieux";
						break;
						
					case 3:
						strMessage="Pas de seconde chance pour les pros";
						break;
					
					case 10:
						strMessage="whaouuuuu";
						break;	
					  
					default:
						strMessage="Tu raconte la merde";
						
						break;
				}
				
				out.println(strMessage);
		
	}

	private static void DemoOperateurConditionel() {
		
		
		int intAge =15;
		
		String strStatut;
		
		out.println(intAge>=18? " Majeur " : " Mineur ");
		
		/*if (intAge>=18) {
			out.println("Majeur");
			
		} else {
			out.println("Mineur");

		}*/
		
	}

	private static void DemoOperateurs() {
		
		
		int intA =0;
		int intB =0;
		int intC =0;
		
		intA++;
		intB+=7;
		intB--;
		intB-=3;
		
		intB*=4;
		
		intC =intB++; //mettre le ++ avant ne donne pas le m�me r�sultat que le mettre derri�re
		
		out.println(intA);
		out.println(intB);
		out.println(intC);
		
		
		out.println(intA != intB); //Op�rateurs de comparaison
		
		
		out.println(intA>0 || intB++>100); //ou
		out.println(intB);
		
		out.println(intA>0 && intB++>100);  //et 
		out.println(intB);
		
		out.println(intA>0 ^ intB++>100); //ou exclusif
		out.println(intB);
		
		
		
	}

	private static void ExerciceConditions() {
		
		/**
		 * Un utilisateur est invit� a saisir son nom et son age
		 * 
		 * Ces informations vont permettre de d�finir sa cotisation
		 * 
		 * Les montants de cotisations son d�finis ainsi:
		 * 
		 * Moins de 20ans -- 50
		 * De 21 � 40 -- 75
		 * De 41 � 65 -- 90
		 * Au del� de 65 --45
		 * 
		 * 
		 * Une fois les noms et �ge saisis, informer l'utilisateur avec un message tel
		 * que : Meriem, merci de r�gler les 75 $ de votre cotisation
		 * 
		 *
		 */
		
		Scanner scanSaisie = new Scanner(System.in);
		
		//saisir son nom 
		
		out.println("Saisir son nom");
		String strNom = scanSaisie.nextLine();
		
		//Saisir son �ge
		
		
		out.println("Saisir son �ge");
		String strAge = scanSaisie.nextLine();
		
		
		//Conversion de la cha�ne de l'�ge
		Integer intAge= Integer.parseInt(strAge);

		 Double dblCotisation;
		 
		if(intAge<20) {
			
			dblCotisation=50d;
			
		}else if(intAge>=21 && intAge<=40) {
			
			dblCotisation=75d;
			
		}else if(intAge>=41 && intAge<=65) {
			
			dblCotisation=90d;
			
		}else {
			
			dblCotisation=45d;
		}
		
		//Exploitation de la valeur saisie
				out.println(strNom + " Merci de r�gler " + dblCotisation);
				
		
	}

	private static void DemoSaisie() {
		
		
		//Pour r�aliser une saisie, il faut une initialisation de scanner
		
		Scanner scanSaisie = new Scanner(System.in);
		
		//Une invite
		
		out.println("Saisir un nom");
		
		//R�cup�rer la saisie
		String strNom = scanSaisie.nextLine();
		
		//Exploitation de la valeur saisie
		out.println("Hello " + strNom.toUpperCase());
		
	}
	

	private static void DemoCondition() {
		
		//Quel jour somme nous, le Dimanche c'est repos
		
		//Obtention de la date du jour
		
		Date dateJour = new Date(0, 0, 0);
		
		//Obtention du jour de la semaine pour la date en cours
		
		int intJourDeLaSemaine = dateJour.getDay();
		
		//Prise en compte de dimanche uniquement
		
		if(intJourDeLaSemaine==0) {
			
			out.println("repos!!!");
		}
		
		//Prise en compte d'une condition et son contraire
		
		if(dateJour.getMonth()==2) {
			out.println("bient�t le primtemps");
			
		}else {
			
			out.println("ahh enfin le primtemps");
		}
		
		
		//Prise en compte de plusieurs cas diff�rents
		
		if(dateJour.getMonth()<3) {
			out.println("Brrrrr");
			
		}else if(dateJour.getMonth()<6){
			
			out.println("Joli primtemps");
		}else if(dateJour.getMonth()<9){
			out.println("Fait chaud, non?");
			
		}else {
			out.println("Retour vers le pourri");
			
		}
		
		
			out.println("fin du traitement");
	}

	
	
	
	enum TypeStagiaire{Perseverant, Bavard, Serieux, Jmdt, Amorphe};

	private static void DemoEnum() {
		
		TypeStagiaire typeMartin = TypeStagiaire.Serieux;
		TypeStagiaire typeJacques = TypeStagiaire.Bavard;
		
		
		if(typeMartin.compareTo(typeJacques)==1) {
			
			out.println("Plus grand");
		}
		
	}

	private static void DemoAppelAttributs() {
		
		//Sollicitation de la classe Ordinateur et de ses attributs
		//D�claration de variable
		
		Ordinateur ordiPC = new Ordinateur();
		
		ordiPC.strMarque="Asus";
	
			
	}
	

	private static void DemoPassageValeur() {
		Integer intA =25;
		out.println("valeur avant appel :" + intA);
		DemoPassageDeValeurs(intA);
		out.println("valeur apr�s appel :" + intA);
	}

	private static void DemoPassageDeValeurs(Integer valeur) {
	
		out.println("valeur re�ue :" + valeur);
		valeur+=10;
		out.println("valeur actualis�e :" + valeur);
		
	}

	private static void DemoPret() {
		
		
		Pret pretConso = new Pret(0.03d, 2, 5000d);
		Pret pretImmo = new Pret(0.0125d, 15, 100000d);
		
		out.println("Mensualit� : " + pretConso.CalculerMensualite());
		out.println("Mensualit� : " + pretImmo.CalculerMensualite());
		
	}

	private static void DemoStagiaire() {
		Stagiaires Martin = new Stagiaires(12);
		Stagiaires Vero = new Stagiaires(20);
		Stagiaires Jonathan = new Stagiaires(25);
		
		
		Martin.SuivreUnCours();
		Martin.SuivreUnCours();
		Martin.Sabsenter();


		
		
		Vero.SuivreUnCours();
		Vero.SuivreUnCours();
		Vero.SuivreUnCours();
		Vero.RealiserTP();
		Vero.RealiserTP();
		Vero.RealiserTP();
		Vero.RealiserTP();
		Vero.RealiserTP();
		Vero.Sabsenter();
		Vero.Sabsenter();
		
		
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.SuivreUnCours();
		Jonathan.RealiserTP();
		
		
		out.println("Martin : " + Martin.getScore());
		out.println("Vero : " + Vero.getScore());
		out.println("Jonathan : " + Jonathan.getScore());
	}

	private static void DemoCompteEpargne() {
		CompteEpargne ce1 = new CompteEpargne(100d);
		ce1.Crediter(50d);
		ce1.TaxeDeBase(35d);
		ce1.Debiter(20d);
		
		
		CompteEpargne ce2 = new CompteEpargne(500d);
		ce2.Crediter(75d);
		ce2.TaxeDeBase(25d);
		  ce2.Debiter(20d);
		
		
		 CompteEpargne ce3 = new CompteEpargne(4000d);
		 ce3.Crediter(1000d);
	     ce3.TaxeDeBase(10d);
	     ce3.Debiter(20d);
		
		
		ce1.getSolde();
		ce2.getSolde();
		ce3.getSolde();
	}
	
	
}
