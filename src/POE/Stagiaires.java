package POE;


public class Stagiaires {
	
	private Integer intScore =0;
	
	
	public Stagiaires(Integer intScoreInitial) {
		
		intScore= intScoreInitial;
	}
	
	public void RealiserTP(){
		intScore+= 3;
		
	}
	
	
	public void SuivreUnCours() {
		intScore+= 2;
		
	}
	
	public void Sabsenter() {
		
		intScore-=4;
	}
	
	public Integer getScore() {
		
		return intScore;
	}
}
