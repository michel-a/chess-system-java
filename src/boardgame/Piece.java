package boardgame;

public class Piece {
	// atributos
	protected Position position;
	private Board board;
	
	// construtor
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
}
