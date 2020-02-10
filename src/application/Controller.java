package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import objetos.Empleados;

public class Controller implements Initializable {
	private ArrayList<Pane> pane = new ArrayList<>();
	@FXML
	private Pane paneAdd, paneMod, paneDel, paneWelck, paneShow, paneShowClass, paneShowSche;
	@FXML
	private ImageView horarioView;
	@FXML
	private TableView<Empleados> empleadosView;
	@FXML
	private TableColumn<Empleados, Integer> id;
	@FXML
	private TableColumn<Empleados, String> nombre;
	@FXML
	private TableColumn<Empleados, String> dni;
	@FXML
	private TableColumn<Empleados, String> cargo;
	@FXML
	private TableColumn<Empleados, Boolean> spinning;
	@FXML
	private TableColumn<Empleados, Boolean> weights;
	@FXML
	private TableColumn<Empleados, Boolean> culturismo;
	@FXML
	private TableColumn<Empleados, Boolean> alterofilia;
	@FXML
	private TableColumn<Empleados, Boolean> running;
	@FXML
	private TableColumn<Empleados, Boolean> boxing;
	@FXML
	private TableColumn<Empleados, Boolean> natacion;
	@FXML
	private TableColumn<Empleados, Float> Horas;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		/*
		 * paneAdd.setVisible(false); paneMod.setVisible(false);
		 * paneDel.setVisible(false); paneWelck.setVisible(true);
		 */
		pane.add(paneAdd);
		pane.add(paneMod);
		pane.add(paneDel);
		pane.add(paneWelck);
		pane.add(paneShowClass);
		pane.add(paneShowSche);
		pane.add(paneShow);
		horarioView.setImage(Main.image);
		ObservableList<Empleados> obsEmp = FXCollections.observableArrayList(Main.empleados);
		id.setCellValueFactory(new PropertyValueFactory<Empleados, Integer>("id2"));
		nombre.setCellValueFactory(new PropertyValueFactory<Empleados, String>("nombre"));
		dni.setCellValueFactory(new PropertyValueFactory<Empleados, String>("DNI"));
		cargo.setCellValueFactory(new PropertyValueFactory<Empleados, String>("cargo"));
		spinning.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("spinning"));
		weights.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("weights"));
		culturismo.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("culturismo"));
		alterofilia.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("alterofilia"));
		running.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("running"));
		boxing.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("boxing"));
		natacion.setCellValueFactory(new PropertyValueFactory<Empleados, Boolean>("natacion"));
		Horas.setCellValueFactory(new PropertyValueFactory<Empleados, Float>("horasJornada"));

		empleadosView.setItems(obsEmp);
	}

	@FXML
	private void actionMenu(ActionEvent event) {
		paneFalse();
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
