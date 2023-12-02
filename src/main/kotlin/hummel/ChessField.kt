package hummel

import java.awt.Color
import java.awt.GridLayout
import javax.swing.JLabel
import javax.swing.JPanel

class ChessField : JPanel() {
	private val pieces: MutableCollection<ChessPiece> = ArrayList()

	init {
		layout = GridLayout(8, 8)
		for (i in 0..7) {
			pieces.add(ChessPiece(PieceType.WHITE_PAWN, 1, i))
			pieces.add(ChessPiece(PieceType.WHITE_PAWN, 6, i))
		}
		for (i in 0..7) {
			for (j in 0..7) {
				val cell = getExistingPiece(i, j)
				cell.isOpaque = true
				cell.background = if (i % 2 == j % 2) Color.BLACK else Color.WHITE
				add(cell)
			}
		}
	}

	private fun getExistingPiece(i: Int, j: Int): JLabel {
		return pieces.firstOrNull {
			it.row == i && it.column == j
		} ?: ChessPiece(PieceType.NULL, i, j)
	}
}