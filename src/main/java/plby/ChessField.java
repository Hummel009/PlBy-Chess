package plby;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

class ChessField extends JPanel {
	private Collection<ChessPiece> pieces = new ArrayList<>();

	ChessField() {
		setLayout(new GridLayout(8, 8));

		for (var i = 0; i < 8; i++) {
			pieces.add(new ChessPiece(PieceType.WHITE_PAWN, 1, i));
			pieces.add(new ChessPiece(PieceType.WHITE_PAWN, 6, i));
		}

		for (var i = 0; i < 8; i++) {
			for (var j = 0; j < 8; j++) {
				var cell = getExistingPiece(i, j);

				cell.setOpaque(true);
				cell.setBackground((i % 2 == j % 2) ? Color.BLACK : Color.WHITE);
				add(cell);
			}
		}
	}

	private JLabel getExistingPiece(int i, int j) {
		for (var piece : pieces) {
			if (piece.getRow() == i && piece.getColumn() == j) {
				return piece;
			}
		}
		return new ChessPiece(PieceType.NULL, i, j);
	}
}