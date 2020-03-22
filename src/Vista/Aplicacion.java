package Vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {
	 public static void main(String[] args) {
	 launch(args);
	 }
	 @Override
	 public void start(Stage stage) throws Exception {
		 stage.setTitle("Circulo en Movimiento");
		 ContenedorPrincipal contPrincipal = new ContenedorPrincipal();
		 Scene scene = new Scene(contPrincipal,800,600);
		 stage.setScene(scene);
		 stage.show();
	 }
	}