package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btMyButton;
	
	@FXML
	public void onMyButtonClick() {
		Alerts.showAlert("Alert title", "Informação Sigilosa", "Cuidado", AlertType.ERROR);
	}
}