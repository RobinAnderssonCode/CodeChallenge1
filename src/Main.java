import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(250, 100); // s�tter storleken efter vad som finns i f�nstret, annars
								// .setSize
		gui.setTitle("Przbelewsky");

	}

}
