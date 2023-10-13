package hummel

import java.awt.Color
import java.awt.GridLayout
import javax.swing.JLabel
import javax.swing.JPanel

class ChessField : JPanel() {
	private val pieces: MutableCollection<ChessPiece> = ArrayList()

	init {
		setLayout(GridLayout(8, 8))
		for (i in 0..7) {
			pieces.add(ChessPiece(PieceType.WHITE_PAWN, 1, i))
			pieces.add(ChessPiece(PieceType.WHITE_PAWN, 6, i))
		}
		for (i in 0..7) {
			for (j in 0..7) {
				val cell = getExistingPiece(i, j)
				cell.setOpaque(true)
				cell.setBackground(if (i % 2 == j % 2) Color.BLACK else Color.WHITE)
				add(cell)
			}
		}
	}

	private fun getExistingPiece(i: Int, j: Int): JLabel {
		for (piece in pieces) {
			if (piece.row == i && piece.column == j) {
				return piece
			}
		}
		return ChessPiece(PieceType.NULL, i, j)
	}
}