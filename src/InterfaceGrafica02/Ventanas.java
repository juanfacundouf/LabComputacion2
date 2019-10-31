package InterfaceGrafica02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventanas extends JFrame {

	public Ventanas() {

		// por defecto es invisible y tiene 0 tamanio
		// indica el tamanio de la ventana
		setSize(600, 350);

		/*
		 * Para elegir tama�o tambi�n se puede utilizar serBounds donde colocamos tanto
		 * el tamanio como la posici�n de la imagen setBounds(x, y, width, height);
		 */

		// indica que pasar� cuando apretemos el boton X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// POSICI�N DE LA VENTANA
		// setLocation(100, 100); //colocamos la ventana donde queramos
		setLocationRelativeTo(null); // si tiene null nos coloca la ventana justo en el centro

		// setResizable(false); //Impide la maximizaci�n o la redimensi�n

		// COLOCAR UN �CONO PERSONALIZADO A MI VENTANA
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Image icono = sistema.getImage("gatito.png");
		setIconImage(icono);

		setTitle("Mi primer Ventana"); // coloca el t�tulo a la venta

		// hace visible el Frame. Siempre colocarlo en �ltimo lugar
		setVisible(true);

		add(new JPanel() {
			public void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.setColor(new Color(255, 128, 155)); 

				g.setFont(new Font("Verdana", Font.BOLD, 30)); 

				g.drawString("Primer panel", 25, 25);
			}
		});

	}

}
