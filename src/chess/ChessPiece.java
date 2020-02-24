package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	// atributo
	private Color color;
	
	// construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	// get
	public Color getColor() {
		return color;
	}
	

}
