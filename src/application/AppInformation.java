package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInformation extends Application {

	@Override
	public void start(Stage infoStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("AppInfoScene.fxml"));
			Scene scene = new Scene(root, 500, 500);
			scene.getStylesheets().add(getClass().getResource("appinfo.css").toExternalForm());
			infoStage.setScene(scene);
			infoStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
