package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class Controller implements Initializable {
	private ArrayList<Pane> pane = new ArrayList<>();
	@FXML
	private Pane paneAdd, paneMod, paneDel, paneWelck, paneShow, paneShowClass, paneShowSche;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		paneAdd.setVisible(false);
		paneMod.setVisible(false);
		paneDel.setVisible(false);
		paneWelck.setVisible(true);
		pane.add(paneAdd);
		pane.add(paneMod);
		pane.add(paneDel);
		pane.add(paneWelck);
	}

	@FXML
	private void actionMenu(ActionEvent event) {
		paneFalse();
		paneWelck.setVisible(false);
		MenuItem menuClicked = (MenuItem) event.getSource();
		switch (menuClicked.getId()) {
		case "add":
			paneAdd.setVisible(true);
			break;
		case "delete":
			paneDel.setVisible(true);
			break;
		case "modify":
			paneMod.setVisible(true);
			break;
		case "show":
			paneShow.setVisible(true);
			break;
		case "showClass":
			paneShowClass.setVisible(true);
			break;
		case "showSche":
			paneShowSche.setVisible(true);
			break;
		default:
			break;
		}

	}

	public void paneFalse() {
		for (int i = 0; i < pane.size(); i++) {
			pane.get(i).setVisible(false);
		}
	}

}
