package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

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

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumber1);	// só aceita números
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 10);	// limite de números digitados
		Constraints.setTextFieldMaxLength(txtNumber2, 10);
	}
}