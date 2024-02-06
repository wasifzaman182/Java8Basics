package templatePattern;

public class TemplateMain {

	public static void main(String[] args) {

		Game chess = new ChessGame();
		chess.play();
		
		System.out.println();
		
		Game monoGame = new MonopolyGame();
		monoGame.play();

	}

}
