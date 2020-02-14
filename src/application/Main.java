package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import objetos.Cliente;
import objetos.Empleados;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	private ObservableList<Empleados> empData = FXCollections.observableArrayList();
	public static Image image;

	@Override
	public void start(Stage primaryStage) {
		try {
			// BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("Ventana.fxml"));
			Scene scene = new Scene(root, 850, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			image = new Image("file:horario.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ObservableList<Empleados> getEmpData() {
		return empData;
	}

	

	public static void main(String[] args) {
		launch(args);
	}
}
