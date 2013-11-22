
public class DiceGame {

	private Player[] players;
	private Dice[] dices;
	
	public DiceGame() {
		
		dices = new Dice[3]; 
		for (int i = 0; i < dices.length; i++) {
			dices[i] = new Dice();
		}
		players = new Player[4];
		players[0] = new Player("Lulu");
		players[1] = new Player("Lili");
		players[2] = new Player("Lala");
		players[3] = new Player("Lolo");
		
		}

	
	
	public void playAround() {
 
		do {
			playOnce();
			
		} while (noWinner());
		
		showResult();
		
	}
	
	
	private boolean noWinner() {
		
		boolean noWinner = true;
		
		for (Player j : players) {
			if (j.uWin()) {
				
				noWinner = false;
			}
		}
		return noWinner;
		
	}
	
	private void playOnce() {
		
		for (Player j : players) {
			j.playOnce(dices);
	}
}	
	
	private void showResult() {
		for (Player j : players) {
			if (j.uWin()) {
				System.out.println(j.getName() + " has won the game");
			}
		}	
	}	
}