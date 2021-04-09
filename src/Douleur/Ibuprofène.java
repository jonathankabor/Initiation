package Douleur;

public class Ibuprofène implements IAntalgique {
	
	private int intDouleur=11;

	@Override
	public void Soulager(int reduction) {
		
		intDouleur=(reduction<=intDouleur)? intDouleur-=reduction:0;

	}

	@Override
	public void Administrer() {
		
		System.out.println("Ibuprofène administré");

	}

	@Override
	public int getDouleur() {
		// TODO Auto-generated method stub
		return intDouleur;
	}

}
