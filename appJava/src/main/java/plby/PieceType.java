package plby;

import java.awt.*;

@SuppressWarnings("unused")
enum PieceType {
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
	NULL("/img/transparent.png", null);

	private final String imagePath;
	private final Color color;

	PieceType(String imagePath, Color color) {
		this.imagePath = imagePath;
		this.color = color;
	}

	public String getImagePath() {
		return imagePath;
	}

	public Color getColor() {
		return color;
	}
}