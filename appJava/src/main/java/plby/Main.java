package plby;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
	public static void main(String... args) {
		EventQueue.invokeLater(() -> {
			var frame = new JFrame();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setTitle("Bootleg Chess");

			var field = new ChessField();
			field.setSize(512, 512);
			frame.add(field);

			frame.setSize(522, 551);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}
}