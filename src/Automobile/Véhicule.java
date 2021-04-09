package Automobile;



public class Véhicule {
	
	protected int intVitesse=0;
	
	
	public int getVitesse() {
		
		return intVitesse;
	}
	
	public void Accelerer(int value) {
		
		if (value>=0) {
			
			intVitesse+=value;
			
		}
	}
	
	public void Freiner(int value) {
		
		intVitesse=(value<intVitesse)?intVitesse-=value:0;
		
	}

}
