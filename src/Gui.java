import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Knappar och sånt
	private static JLabel label;
	private JButton button;
	private JTextField textField;

	// Constructor
	public Gui() {
		setLayout(new FlowLayout());

		button = new JButton("Prez");
		add(button);

		textField = new JTextField("Enter number", 10);
		add(textField);

		label = new JLabel("");
		add(label);

		// länkat till AListener classen nedan
		AListener e = new AListener();
		button.addActionListener(e);

	}

	// subclass named AListener
	public class AListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String input;
			input = textField.getText();
			Class2.run(input);
		}
	}

	public static class LabelClass {
		public static void labelFunction(String sResult) {
			label.setText(sResult);

		}
	}

}
