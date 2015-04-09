package progetto1;

import rubrica_telefonica.*;

public class ProgRub {

	public static void main(String[] args) {
		Rubrica miaRubrica=new Rubrica();
		Menu mioMenu=new Menu();
		int scelta;
		
		scelta=mioMenu.scelta();
		
		while(scelta!=4){
			if(scelta==1){
				Voce v=new Voce();
				miaRubrica.aggiungiVoce(v);
			}
			else if(scelta==2){
				int indice=mioMenu.leggiIndice();
				miaRubrica.eliminaVoce(indice);
			}
			else if(scelta==3){
				miaRubrica.visualizza();
			}
			scelta=mioMenu.scelta();
		}
		System.out.println("Fine programma.");
	}
}
