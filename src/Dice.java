public class Dice {
	
	private int faceValue;
	private final int NB_FACE_MAX = 6;
	
	 
public Dice() {
	
	faceValue = 1;
}

// exemple de redéfinition de constructeur

public Dice(int initialValue) {
	faceValue = initialValue;
}

public int getValue() {
	
	return faceValue;
}

public void lancer() {
	
	faceValue = (int) (Math.random() * NB_FACE_MAX) +1;
	}
}