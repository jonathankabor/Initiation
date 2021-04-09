package Assurance;

public abstract class ContratAssurance {
	
	//Méthodes communes 
	
	public void Signer() {
		
		System.out.println("Contrat signé");
	}

	
	public void Resilier() {
			
			System.out.println("Contrat résilié");
	}
	
	public abstract void Rembourser();

}
