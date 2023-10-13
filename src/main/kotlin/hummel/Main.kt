package hummel

import java.awt.EventQueue
import javax.swing.JFrame
import javax.swing.JFrame.EXIT_ON_CLOSE

fun main() {
	EventQueue.invokeLater {
		val frame = JFrame()
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE)
		frame.setTitle("Bootleg Chess")
		val field = ChessField()
		field.setSize(512, 512)
		frame.add(field)
		frame.setSize(522, 551)
		frame.setLocationRelativeTo(null)
		frame.isVisible = true
	}
}