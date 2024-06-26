package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btMySum;
	
	@FXML
	public void onMyButSumAction() {
		try {
			double n1 = Double.parseDouble(txtNumber1.getText());
			double n2 = Double.parseDouble(txtNumber2.getText());
			double sum = n1 + n2;
			labelResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Erro", "Dado inválido", e.getMessage(), AlertType.ERROR);
		}
		
	}
}