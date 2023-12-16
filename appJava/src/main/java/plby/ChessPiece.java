package plby;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("unused")
class ChessPiece extends JLabel {
	private final PieceType piece;
	private final int row;
	private final int column;

	ChessPiece(PieceType pieceType, int row, int column) {
		piece = pieceType;
		this.row = row;
		this.column = column;
		try {
			var imagePath = pieceType.getImagePath();
			var imageStream = ChessPiece.class.getResourceAsStream(imagePath);
			var bufferedImage = ImageIO.read(imageStream);
			var scaledImage = bufferedImage.getScaledInstance(58, 58, Image.SCALE_SMOOTH);
			Icon imageIcon = new ImageIcon(scaledImage);
			setIcon(imageIcon);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public PieceType getPiece() {
		return piece;
	}
}