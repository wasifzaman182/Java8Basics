package templatePattern;

public abstract class Game {
	
	public void play() {
		
		initilizeGame();
		startGame();
		endGame();
	}
	
	public abstract void initilizeGame() ;
	public abstract void startGame();
	public abstract void endGame();
	

}
