package Controlador;
import javafx.event.EventHandler;
import Modelo.Robot;
import Vista.ContenedorPrincipal;
import javafx.event.ActionEvent;

public class MoverRobotIzquierda implements EventHandler<ActionEvent>{
	private ContenedorPrincipal control;
	
	public MoverRobotIzquierda(ContenedorPrincipal contr) {
		this.control=contr;
	}
	@Override
	public void handle(ActionEvent arg0) {
		this.control.moverRobot(-10);
		this.control.actualizar();
	 }

}
