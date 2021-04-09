package Banque;

public class Pret {
	
	//Des attributs locaux
	private Double dblTaux;
	private Double dblMontant;
	private Integer intDuree;
	
	//Le code client doit fournir un taux, une durée et un montant à l'instanciation de cette classe
	public Pret(Double Taux, Integer Duree, Double Montant) {
		
		dblTaux= Taux;
		intDuree=Duree;
		dblMontant=Montant;
		
		
	}
	
	public Double CalculerMensualite() {
		
		return (dblMontant*dblTaux/12)/Math.pow (1-(1+dblTaux/12), (-(intDuree/12)*12));
	}

}
