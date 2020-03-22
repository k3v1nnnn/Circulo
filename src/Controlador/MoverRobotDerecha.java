package Controlador;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import Modelo.Robot;
import Vista.ContenedorPrincipal;

public class MoverRobotDerecha implements EventHandler<ActionEvent>{
	private ContenedorPrincipal control;
	
	public MoverRobotDerecha(ContenedorPrincipal contr) {
		this.control=contr;
	}
	@Override
	public void handle(ActionEvent arg0) {
		this.control.moverRobot(10);
		this.control.actualizar();
	 }
	
}
