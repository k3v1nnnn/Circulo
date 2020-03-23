package Vista;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import Controlador.MoverRobot;
import Modelo.Robot;

public class ContenedorPrincipal extends BorderPane {
	private Pane pane;
	public ContenedorPrincipal() {
		Robot robot = new Robot();
		HBox hbox = new HBox();
		Button bIzquierdo = new Button("Izquierda");
		Button bDerecho = new Button("Derecha");
		Button bAbajo = new Button("Abajo");
		Button bArriba = new Button("Arriba");
		MoverRobot mIzquierdo = new MoverRobot(this,robot,"Izquierda");
		MoverRobot mDerecha = new MoverRobot(this,robot,"Derecha");
		MoverRobot mAbajo = new MoverRobot(this,robot,"Abajo");
		MoverRobot mArriba = new MoverRobot(this,robot,"Arriba");
		HBox.setHgrow(bIzquierdo, Priority.ALWAYS);
		HBox.setHgrow(bDerecho, Priority.ALWAYS);
		HBox.setHgrow(bAbajo, Priority.ALWAYS);
		HBox.setHgrow(bArriba, Priority.ALWAYS);
		bIzquierdo.setMaxWidth(Double.MAX_VALUE);
		bDerecho.setMaxWidth(Double.MAX_VALUE);
		bAbajo.setMaxWidth(Double.MAX_VALUE);
		bArriba.setMaxWidth(Double.MAX_VALUE);
		bIzquierdo.setOnAction(mIzquierdo);
		bDerecho.setOnAction(mDerecha);
		bAbajo.setOnAction(mAbajo);
		bArriba.setOnAction(mArriba);
		hbox.getChildren().addAll(bIzquierdo,bAbajo,bArriba,bDerecho);
		this.setBottom(hbox);
		this.pane = new Pane();
		Circle circulo = new Circle(0,0,10);
		circulo.setFill(Color.CHOCOLATE);
		pane.getChildren().add(circulo);
		this.setCenter(pane);
	}
	public void actualizar(int x,int y) {
		this.pane.getChildren().clear();
		Circle circulo = new Circle(x,y,10);
		circulo.setFill(Color.CHOCOLATE);
		pane.getChildren().add(circulo);
		
	}
	
}
