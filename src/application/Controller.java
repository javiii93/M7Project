package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import objetos.Cliente;
import objetos.Empleados;

public class Controller implements Initializable {
	private ArrayList<Pane> pane = new ArrayList<>();
	private static ArrayList<Empleados> employee,delEmployee;
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	@FXML
	private Pane paneAdd, paneMod, paneDel, paneWelck, paneShow, paneShowClass, paneShowSche;
	@FXML
	private ImageView horarioView;
	@FXML
	private TableView<Empleados> empleadosView;
	@FXML
	private TableColumn<Empleados, Integer> id;
	@FXML
	private TableColumn<Empleados, String> nombre, dni, cargo;
	@FXML
	private TableColumn<Empleados, CheckBox> spinning, weights, culturismo, alterofilia, running, boxing, natacion;
	@FXML
	private TableColumn<Empleados, Float> Horas;
	@FXML
	private ListView<Empleados> empView, delEmpView;
	private Button cancel, delEmp, confirm;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		llenarArray();
		// Employee table
		ObservableList<Empleados> obsEmp = FXCollections.observableArrayList(employee);
		ObservableList<Empleados> obsEmpDel = FXCollections.observableArrayList(delEmployee);
		id.setCellValueFactory(new PropertyValueFactory<Empleados, Integer>("id2"));
		nombre.setCellValueFactory(new PropertyValueFactory<Empleados, String>("nombre"));
		dni.setCellValueFactory(new PropertyValueFactory<Empleados, String>("DNI"));
		cargo.setCellValueFactory(new PropertyValueFactory<Empleados, String>("cargo"));
		spinning.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("spinning"));
		weights.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("weights"));
		culturismo.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("culturismo"));
		alterofilia.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("alterofilia"));
		running.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("running"));
		boxing.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("boxing"));
		natacion.setCellValueFactory(new PropertyValueFactory<Empleados, CheckBox>("natacion"));
		Horas.setCellValueFactory(new PropertyValueFactory<Empleados, Float>("horasJornada"));
		empleadosView.setItems(obsEmp);
		empleadosView.setEditable(false);
		empView.setItems(obsEmp);
		empView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		delEmpView.setItems(obsEmpDel);
		delEmpView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		pane.add(paneAdd);
		pane.add(paneMod);
		pane.add(paneDel);
		pane.add(paneWelck);
		pane.add(paneShowClass);
		pane.add(paneShowSche);
		pane.add(paneShow);

		horarioView.setImage(new Image("file:horario.png"));

	}

	@FXML
	private void delMenu(ActionEvent event) {
		
		Button b = (Button) event.getSource();
		MultipleSelectionModel<Empleados>sel=empView.getSelectionModel();
		MultipleSelectionModel<Empleados>selDel=delEmpView.getSelectionModel();
		ObservableList<Empleados>newObList=sel.getSelectedItems();
		switch (b.getId()) {
		case "cancel":

			break;
		case "delEmp":
			if(!sel.isEmpty()) {
				delEmployee=(ArrayList<Empleados>) sel.getSelectedItems();
				for(Empleados e : delEmployee) {
					employee.remove(e);
									}
			}

			break;
		case "confirm":

			break;

		default:
			break;
		}
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

	public static void llenarArray() {
		delEmployee=new ArrayList<>();
		employee = new ArrayList<>();
		employee.add(new Empleados(1, "Manolo Escobar", "45899581H", "gerente", 40, 100));
		employee.add(new Empleados(2, "Benito Garcia", "25369841V", "profesor", 20, 50));
		employee.add(new Empleados(3, "Llorente Ruiz", "17849652B", "profesor", 20, 70));
		employee.add(new Empleados(4, "Maria Carrasco", "88874569N", "profesor", 40, 20));
		employee.add(new Empleados(5, "Luis Comunica", "98746321R", "profesor", 40, 10));
		employee.get(2).getBoxing().setSelected(true);
		employee.get(3).getAlterofilia().setSelected(true);
		employee.get(1).getNatacion().setSelected(true);
		employee.get(1).getCulturismo().setSelected(true);
		employee.get(3).getRunning().setSelected(true);
		employee.get(2).getSpinning().setSelected(true);
		employee.get(3).getWeights().setSelected(true);
		clientes.add(new Cliente(100, 2, "89456325G", "Transferencia", true, 33.65f));
		clientes.add(new Cliente(101, 3, "89456665P", "Cash", true, 33.65f));
		clientes.add(new Cliente(102, 4, "89456000J", "Transferencia", false, 55.9f));
		clientes.add(new Cliente(103, 5, "3652147Q", "Cash", false, 39.14f));

	}

	public void paneFalse() {
		for (int i = 0; i < pane.size(); i++) {
			pane.get(i).setVisible(false);
		}
	}

}
