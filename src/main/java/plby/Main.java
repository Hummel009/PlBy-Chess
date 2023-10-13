package plby;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Bootleg Chess");

			ChessField field = new ChessField();
			field.setSize(512, 512);
			frame.add(field);

			frame.setSize(522, 551);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}
}