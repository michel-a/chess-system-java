package chess;

import boardgame.Board;

// partida de xadrez
public class ChessMatch {
	// atributo
	private Board board;
	
	// construtor
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	// método
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
}
