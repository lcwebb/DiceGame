
public class Combinaison {

	private boolean gotA4;
	private boolean gotA2;
	private boolean gotA1;
	
public Combinaison() {
	
	this(false, false, false);
}
	
public Combinaison(boolean gotA4, boolean gotA2, boolean gotA1) {
	
	this.gotA4 = gotA4;
	this.gotA2 = gotA2;
	this.gotA1 = gotA1;
}

public void acceptDiceValue(int valeur) {
	
	switch (valeur) {
	
	case 4 :
		gotA4 = true;
		break;
	
	case 2 :
		gotA2 = true;
		break;
		
	case 1 : 
		gotA1 = true;
		break;
		
	default:
		System.out.println( " pas de condition satisfaite");
	}
}

public boolean conditionOk() {
	
	return gotA4 && gotA2 && gotA1;
	
	}

}

