package Automobile;



public class Voiture extends Véhicule {
	
	private boolean StatutPropete;
	

	public boolean isStatutPropete() {
		
		return StatutPropete;
	}
	

	public void setStatutPropete(boolean statutPropete) {
		
		StatutPropete = statutPropete;
	}
	
	public void Laver() {
		
		StatutPropete=true;
	}

}
