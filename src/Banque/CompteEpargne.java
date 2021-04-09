package Banque;

public class CompteEpargne {
	
	private Double dblSolde = 0d;
	
public CompteEpargne(Double dblSoldeInitial) {
		
		dblSolde= dblSoldeInitial;
	}
	
	public double getSolde() {System.out.println("Solde : " + dblSolde);
		return dblSolde;
	}
		
	public void setSolde(Double valeur) {dblSolde = valeur;}
	
	
	public void Crediter(Double dblDepot) {
		
		dblSolde+=dblDepot;
			
	}
	
    public void Debiter(Double dblRetrait) {
		
		dblSolde-=dblRetrait;
		
		
	}
    
    
    /*
     * Cr�er une m�thode Taxer qui attend un param�tre TaxeDeBase de type double
     * Cette m�thode r�duit le solde de 2% ajout�s � la taxe de base
     * Exemple : pour un solde de 200 et une taxe de base de 25, Taxer diminue le solde de (solde*2% + 25)
     * 
     * Proc�der � la taxation de ce1, ce2 et ce3 entre le cr�dit et le d�bit.
     */
	
	public void TaxeDeBase(Double dblTaxer) {
		
		dblSolde= (dblSolde*0.02 + dblTaxer);
	}
	
}