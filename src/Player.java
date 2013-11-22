
public class Player {

	private int score;
	private String name;
	private Dice[] dices;
	
	
	
	public Player(String namePlayer) {
		
		namePlayer = name;
		score = 0;
		
		dices = new Dice[3];
		
	
	}
	
	public String getName() {
		return name;
	}
	 
	public void playOnce(Dice[] dices) {
		
		
		
		/*for (int i = 0; i < dices.length; i++) {
			dices[i].lancer();
		}
		*/
	
		 for (Dice dice: dices) {
		  
		  dice.lancer();
		 }
		
		Combinaison combinaison = new Combinaison();
				for (Dice dice: dices) {
				combinaison.acceptDiceValue(dice.getValue());
				}
	
		
		
		
		if (combinaison.conditionOk()) {
			
			score++;
		}
	}	
		
	public boolean uWin() {
		
		return (score == 1);
	
	}
		
}

