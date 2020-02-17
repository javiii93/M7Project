package application;

import java.util.ArrayList;
import java.util.Optional;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import objetos.Cliente;
import objetos.Empleados;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;

public class Main extends Application {
	private ObservableList<Empleados> empData = FXCollections.observableArrayList();
	 private Stage primaryStage;
	public static Image image;

	@Override
	public void start(Stage stage) {
		try {
			this.primaryStage = stage;
			// BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("Ventana.fxml"));
			Scene scene = new Scene(root, 850, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setOnCloseRequest(confirmCloseEventHandler);
			image = new Image("file:horario.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private EventHandler<WindowEvent> confirmCloseEventHandler = event -> {
        Alert closeConfirmation = new Alert(
                Alert.AlertType.CONFIRMATION,
                "¿Seguro que desea salir?"
        );
        Button exitButton = (Button) closeConfirmation.getDialogPane().lookupButton(
                ButtonType.OK
        );
        exitButton.setText("Si");
        closeConfirmation.setHeaderText("Saliendo..");
        closeConfirmation.initModality(Modality.APPLICATION_MODAL);
        closeConfirmation.initOwner(primaryStage);

        // normally, you would just use the default alert positioning,
        // but for this simple sample the main stage is small,
        // so explicitly position the alert so that the main window can still be seen.
        closeConfirmation.setX(primaryStage.getX()+primaryStage.getWidth()/2-200);
        closeConfirmation.setY(primaryStage.getY() + primaryStage.getHeight()/2-125);

        Optional<ButtonType> closeResponse = closeConfirmation.showAndWait();
        if (!ButtonType.OK.equals(closeResponse.get())) {
            event.consume();
        }
    };


	public ObservableList<Empleados> getEmpData() {
		return empData;
	}

	

	public static void main(String[] args) {
		launch(args);
	}
}
