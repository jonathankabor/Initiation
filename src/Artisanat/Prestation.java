package Artisanat;

import java.time.LocalDate;

import Artisanat.Devis.TypeConseil;

	public class Prestation {
	
		LocalDate datePresta;
		public int intQuantite;
		public double dblPU;
		public String strDescription;
		public TypeConseil typeConseil;
		
		public Prestation(LocalDate datepresta, int qte, double pu, String description) {
			
			datePresta=datepresta;
			intQuantite=qte;
			dblPU=pu;
			strDescription=description;
			
		}
		
		//La surcharge de méthode
		
		public Prestation(LocalDate datepresta, TypeConseil conseil) {
			
			
			datePresta=datepresta;
			typeConseil=conseil;
			
		}
		
		
		
	}

