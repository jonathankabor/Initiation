package Automobile;


public class Camion extends V�hicule {
	
	
	private boolean blnCharge;
	
	public void Decharger() {
		
		blnCharge= false;
	}

	
	public void Charger() {
		
		blnCharge= true;
	}
	
	public boolean StatutCharge() {
		
		return blnCharge;
	}
	
	@Override
	
	public void Accelerer(int value) {
		
		if (value>=5) {
					
			intVitesse+=value-5;
					
		}
	}
}
