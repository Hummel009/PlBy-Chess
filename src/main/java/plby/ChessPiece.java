package plby;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

class ChessPiece extends JLabel {
	private PieceType piece;
	private int row;
	private int column;

	ChessPiece(PieceType pieceType, int row, int column) {
		piece = pieceType;
		this.row = row;
		this.column = column;
		try {
			String imagePath = pieceType.getImagePath();
			InputStream imageStream = Main.class.getResourceAsStream(imagePath);
			BufferedImage bufferedImage = ImageIO.read(imageStream);
			Image scaledImage = bufferedImage.getScaledInstance(58, 58, Image.SCALE_SMOOTH);
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