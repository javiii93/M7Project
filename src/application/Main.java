package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import objetos.Cliente;
import objetos.Empleado;
import objetos.Empleados;
import objetos.Persona;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@FXML
	private TableView<String> tabla;
	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Empleados> empleados = new ArrayList<>();

	@Override
	public void start(Stage primaryStage) {
		try {
			// BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("Ventana.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			llenarArray();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void llenarArray() {
		empleados.add(new Empleados(1, "45899581H", "gerente", false, false, false, false, false, false, false, 40, 100));
		empleados.add(new Empleados(2, "25369841V", "profesor", true, false, false, false, false, false, true, 20, 50));
		empleados.add(new Empleados(3, "17849652B", "profesor", false, true, false, false, false, true, false, 20, 70));
		empleados.add(new Empleados(4, "88874569N", "profesor", false, false, true, false, true, false, false, 40, 20));
		empleados.add(new Empleados(5, "98746321R", "profesor", false, false, false, true, false, false, true, 40, 10));
		clientes.add(new Cliente(100, 2, "89456325G", "Transferencia", true, 33.65f));
		clientes.add(new Cliente(101, 3, "89456665P", "Cash", true, 33.65f));
		clientes.add(new Cliente(102, 4, "89456000J", "Transferencia", false, 55.9f));
		clientes.add(new Cliente(103, 5, "3652147Q", "Cash", false, 39.14f));
		
		
		
		
	
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
