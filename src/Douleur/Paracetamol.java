package Douleur;

public class Paracetamol implements IAntalgique {
	
	private int intDouleur=12;

	@Override
	public void Soulager(int reduction) {
		
		intDouleur=(reduction<=intDouleur)? intDouleur-=reduction:0;

	}

	@Override
	public void Administrer() {
		
		System.out.println("Paracetamol administré");

	}

	@Override
	public int getDouleur() {
		// TODO Auto-generated method stub
		return intDouleur;
	}

}
