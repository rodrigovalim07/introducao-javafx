package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboPerson;
	
	@FXML
	private Button btAll;
	
	private ObservableList<Person> obsList;
	
	@FXML
	public void onBtAllAction() {
		for (Person person : comboPerson.getItems()) {
			System.out.println(person);
		}
	}
	
	@FXML
	public void onComboBoxPersonAction() {	// imprime o item selecionado
		Person person = comboPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Maria", "maria@gmail.com"));
		list.add(new Person(2, "Alex", "alex@gmail.com"));
		list.add(new Person(3, "Box", "bob@gmail.com"));
		
		obsList = FXCollections.observableArrayList(list);
		comboPerson.setItems(obsList);
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
		    @Override
		    protected void updateItem(Person item, boolean empty) {
		        super.updateItem(item, empty);
		        setText(empty ? "" : item.getName());
		    }
		};

		comboPerson.setCellFactory(factory);
		comboPerson.setButtonCell(factory.call(null));
	}
}