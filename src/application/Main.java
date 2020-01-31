package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import objetos.Empleado;
import objetos.Persona;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	ArrayList<Persona>people=new ArrayList<>();
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root=FXMLLoader.load(getClass().getResource("Ventana.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void llenarArray() {
		Empleado e1=new Empleado();
		e1.setId(1);
		e1.setNombre("Manolo");
		e1.setApellido1("Garcia");
		e1.setApellido2("Serrano");
		e1.setNif("47899876H");
		e1.setSexo("M");
		e1.setCargo("Gerente");
		e1.setJornadaHoras(30f);
		e1.setPrecioHora(80f);
		e1.setSueldoMes(e1.getJornadaHoras()*e1.getPrecioHora());
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
