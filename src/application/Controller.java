package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class Controller implements Initializable {
	@FXML
	private Pane paneAdd,paneMod,paneDel,paneWelck;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		paneAdd.setVisible(false);
		paneMod.setVisible(false);
		paneDel.setVisible(false);
		paneWelck.setVisible(true);
		
	}
	
	@FXML
    private void actionMenu(ActionEvent event)
    {	paneWelck.setVisible(false);
		MenuItem menuClicked=(MenuItem) event.getSource();
    switch (menuClicked.getId()) {
	case "add":
		paneAdd.setVisible(true);
		break;
	case "delete":
		break;
	case "modify":
		break;
	case "show":
		break;
	case "showClass":
		break;
	case "showSche":
		break;
	default:
		break;
	}
    
    }

}
