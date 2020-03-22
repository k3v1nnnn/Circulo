package Vista;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import Controlador.MoverRobotIzquierda;
import Controlador.MoverRobotDerecha;
import Modelo.Robot;

public class ContenedorPrincipal extends BorderPane {
	private Robot robot;
	private Pane pane;
	public ContenedorPrincipal() {
		this.robot = new Robot();
		HBox hbox = new HBox();
		Button bIzquierdo = new Button("Izquierda");
		Button bDerecho = new Button("Derecha");
		MoverRobotIzquierda mIzquierdo = new MoverRobotIzquierda(this);
		MoverRobotDerecha mDerecha = new MoverRobotDerecha(this);
		HBox.setHgrow(bIzquierdo, Priority.ALWAYS);
		HBox.setHgrow(bDerecho, Priority.ALWAYS);
		bIzquierdo.setMaxWidth(Double.MAX_VALUE);
		bDerecho.setMaxWidth(Double.MAX_VALUE);
		bIzquierdo.setOnAction(mIzquierdo);
		bDerecho.setOnAction(mDerecha);
		hbox.getChildren().addAll(bIzquierdo, bDerecho);
		this.setBottom(hbox);
		this.pane = new Pane();
		this.actualizar();
		this.setCenter(pane);
	}
	public void actualizar() {
		this.pane.getChildren().clear();
		Circle circulo = new Circle(this.robot.posicionX(),this.robot.posicionY(),10);
		circulo.setFill(Color.CHOCOLATE);
		pane.getChildren().add(circulo);
		
	}
	public void moverRobot(int pasos) {
		this.robot.nuevaPos(pasos, 0);
	}
	
}
