package cambiosDeEstado;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

class EventosDeVentana implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado.");
		//para ver que estado ten�a
		System.out.println(e.getNewState());
	}
	
	
	
}