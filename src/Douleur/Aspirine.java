package Douleur;

public class Aspirine implements IAntalgique {
	
	private int intDouleur=10;

	@Override
	public void Soulager(int reduction) {
		
		intDouleur=(reduction<=intDouleur)? intDouleur-=reduction:0;

	}

	@Override
	public void Administrer() {
		
		System.out.println("Aspirine administrée");

	}

	@Override
	public int getDouleur() {
		// TODO Auto-generated method stub
		return intDouleur;
	}

}
