package isprojekt3;

import java.awt.EventQueue;

import sysmodu6.controllers.PersonsController;
import sysmodu6.models.PersonsRegister;

public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new PersonsController(new PersonsRegister());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

// asdasfasfasf
