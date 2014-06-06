package cl.paradigmas.main;

import javax.swing.JToggleButton;

import cl.paradigmas.gui.Canvas;
import cl.paradigmas.gui.ParadigmasToolBar;
import cl.paradigmas.gui.Ventana;
import cl.paradigmas.gui.eventos.EventBuilder;


public class Main {
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ParadigmasToolBar toolbar = ventana.getToolbar();
		Canvas canvas = ventana.getCanvas();
		EventBuilder eventos = EventBuilder.getEvents(ventana);
		
		toolbar.addBtn("CIRCULO", new JToggleButton("CIRCULO"));
		toolbar.addBtn("MOVER", new JToggleButton("MOVER"));
		
		toolbar.getBtnLimpiar().addActionListener(eventos);
		toolbar.getBtn("CIRCULO").addActionListener(eventos);
		toolbar.getBtn("MOVER").addActionListener(eventos);
		
		canvas.addMouseListener(eventos);
		canvas.addMouseMotionListener(eventos);
		
		ventana.setVisible(true);
	}

}


