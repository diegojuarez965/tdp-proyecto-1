package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Student estudiante = new Student(126974, "Juarez", "Diego", "diegohernanjuarez965@gmail.com",
						"https://github.com/diegojuarez965",
						"file:///C:/Users/54291/Documents/TECNOLOG%CDA%20DE%20PROGRAMACI%D3N/Proy1/proyecto-1/src/images/foto.jpg");
				SimplePresentationScreen ventana = new SimplePresentationScreen(estudiante);
				ventana.setVisible(true);
			}
		});
	}
}