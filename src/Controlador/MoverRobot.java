package Controlador;

import Vista.ContenedorPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.Robot;

public class MoverRobot implements EventHandler<ActionEvent> {
	private ContenedorPrincipal cPrincipal;
	private Robot bRobot;
	private String bDireccion;
	
	public MoverRobot(ContenedorPrincipal contenedor,Robot robot,String nDireccion) {
		this.cPrincipal=contenedor;
		this.bRobot=robot;
		this.bDireccion=nDireccion;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		this.bRobot.nuevaPos(this.bDireccion);
		this.cPrincipal.actualizar(this.bRobot.posicionX(),this.bRobot.posicionY());
	}

}
