module javafx1 {
	requires javafx.controls;
	requires javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;   
	exports gui to javafx.fxml;     
	opens gui to javafx.fxml; 
}
