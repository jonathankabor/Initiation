package Assurance;

public abstract class ContratAssurance {
	
	//M�thodes communes 
	
	public void Signer() {
		
		System.out.println("Contrat sign�");
	}

	
	public void Resilier() {
			
			System.out.println("Contrat r�sili�");
	}
	
	public abstract void Rembourser();

}
