package Douleur;

public class Ibuprof�ne implements IAntalgique {
	
	private int intDouleur=11;

	@Override
	public void Soulager(int reduction) {
		
		intDouleur=(reduction<=intDouleur)? intDouleur-=reduction:0;

	}

	@Override
	public void Administrer() {
		
		System.out.println("Ibuprof�ne administr�");

	}

	@Override
	public int getDouleur() {
		// TODO Auto-generated method stub
		return intDouleur;
	}

}
