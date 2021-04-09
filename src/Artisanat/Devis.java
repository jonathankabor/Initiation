package Artisanat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;




	
	public class Devis {
		
		
		//Creation d'une collection de prestations pour historiser les différentes prestations
		//Chiffrées par le devis
		
		ArrayList<Prestation> Prestations = new ArrayList<>();
		
		LocalDate dateDevis;
		Double dblMontantDevis = 0d;
		
		
	public Devis(LocalDate datedevis) {
		
		//récupération de la date de devis lors de l'instanciation
		
		dateDevis= datedevis;
	}
		
		
	public LocalDate getDateDevis() {
			
		return dateDevis;
		
		}
	
	public Double getMontantDevis() {
		
	return dblMontantDevis;
	
		}
	
	
	public ArrayList<Prestation>getDetails(){
		
		return Prestations;
	}
	
	
	public void AjouterMarchandises(int Quantite, double PU) {
		
		dblMontantDevis+=(Quantite*PU);
		
	}
	
	public void AjouterMarchandises(Prestation presta) 
	{
		//Calcul
		dblMontantDevis+=(presta.dblPU*presta.intQuantite);
		
		//Ajout au détail historique
		Prestations.add(presta);
		
	}
	

	public void AjouterHonoraires(int nbHeures, double TarifHoraires) {
		
		dblMontantDevis+=(nbHeures*TarifHoraires);
		
		if (nbHeures<5) {dblMontantDevis+=50;}
		
		//dblMontantDevis=(nbHeures<5)?dblMontantDevis+=(nbHeures*TarifHoraire):dblMontantDevis=(nbHeures*TarifHoraire)+50;
		
		}
	
	public void AjouterHonoraires(Prestation presta) {
		
		//Calcul
				dblMontantDevis+=(presta.intQuantite*presta.dblPU);
				
				if(presta.intQuantite<5) {dblMontantDevis+=50;}
				
				//Ajout au détail historique
				Prestations.add(presta);
	}
	
	public enum TypeConseil {Sol, Peinture, Cloisons, Electricite, Plomberie}
	
	
	public void AjouterConseil (Prestation presta)
	{
		double dblCout;
		
		switch (presta.typeConseil) {
		case Sol:
			dblCout=120;
			break;
		case Peinture:
			dblCout=120;
			break;
		case Cloisons:
			dblCout=80;
			break;
		case Electricite:
			dblCout=150;
			
			if (presta.datePresta.getDayOfWeek()==DayOfWeek.SATURDAY ||
					presta.datePresta.getDayOfWeek()==DayOfWeek.SUNDAY
					) {
				dblCout+=15;
			}
			
			
			break;
		case Plomberie:
			dblCout=160;
			break;

		default:
			dblCout=180;
			break;
		}
		
		dblMontantDevis+=dblCout;
		
		Prestations.add(presta);
		}


	public void AjouterConseil(TypeConseil sol, LocalDate of) {
		// TODO Auto-generated method stub
		
	}

		
	}

	
	
	
	
	
	
	
	
	
