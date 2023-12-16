package plby

import java.awt.Color

@Suppress("unused")
enum class PieceType(val imagePath: String, val color: Color?) {
	WHITE_PAWN("/img/white_pawn.png", Color.WHITE),
	WHITE_ROOK("/img/white_rook.png", Color.WHITE),
	WHITE_KNIGHT("/img/white_knight.png", Color.WHITE),
	WHITE_BISHOP("/img/white_bishop.png", Color.WHITE),
	WHITE_QUEEN("/img/white_queen.png", Color.WHITE),
	WHITE_KING("/img/white_king.png", Color.WHITE),
	BLACK_PAWN("/img/black_pawn.png", Color.BLACK),
	BLACK_ROOK("/img/black_rook.png", Color.BLACK),
	BLACK_KNIGHT("/img/black_knight.png", Color.BLACK),
	BLACK_BISHOP("/img/black_bishop.png", Color.BLACK),
	BLACK_QUEEN("/img/black_queen.png", Color.BLACK),
	BLACK_KING("/img/black_king.png", Color.BLACK),
	NULL("/img/transparent.png", null)
}