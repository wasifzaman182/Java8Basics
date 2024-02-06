package templatePattern;

public class ChessGame  extends Game{

	@Override
	public void initilizeGame() {
		System.out.println("Initilizing chess game");
		
	}

	@Override
	public void startGame() {
		System.out.println("Starting chess game");
		
	}

	@Override
	public void endGame() {
		System.out.println("Ending chess game");
	}
	

}
