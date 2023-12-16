package plby

import java.awt.Image
import javax.imageio.ImageIO
import javax.swing.Icon
import javax.swing.ImageIcon
import javax.swing.JLabel

class ChessPiece(piece: PieceType, val row: Int, val column: Int) : JLabel() {
	init {
		try {
			val imagePath = piece.imagePath
			val imageStream = ChessPiece::class.java.getResourceAsStream(imagePath)
			val bufferedImage = ImageIO.read(imageStream)
			val scaledImage = bufferedImage.getScaledInstance(58, 58, Image.SCALE_SMOOTH)
			val imageIcon: Icon = ImageIcon(scaledImage)
			icon = imageIcon
		} catch (e: Exception) {
			e.printStackTrace()
		}
	}
}