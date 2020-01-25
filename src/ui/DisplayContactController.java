package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class DisplayContactController {

	@FXML
	private Circle imageCircle;

	@FXML
	private TextField displayPhoneNumberTF;

	@FXML
	private TextField displayNameTF;

	@FXML
	private TextField displayLastnameTF;

	@FXML
	private TextField displayAddresTF;

	@FXML
	private TextField displayPCTF;

	@FXML
	private DatePicker birthdateDisplayDP;

	@FXML
	private TextField ageTF;

	@FXML
	private TextField lastCallTF;
	
	@FXML
	private Button editToggleBTN;

	/**Determines wether or not the GUI is in edit mode*/
	private boolean editable = false;
	
	@FXML
	void toggleEdit(ActionEvent event) {
		if(editable==false) {
			editable = true;
			editToggleBTN.setText("Guardar");
		}else {
			editable = false;
			editToggleBTN.setText("Editar");
		}
		modifyEditableProperty();
	}
	
	private void modifyEditableProperty() {
		displayPhoneNumberTF.setEditable(editable);
		displayNameTF.setEditable(editable);
		displayLastnameTF.setEditable(editable);
		displayAddresTF.setEditable(editable);
		displayPCTF.setEditable(editable);
		birthdateDisplayDP.setEditable(editable);
		ageTF.setEditable(editable);
		lastCallTF.setEditable(editable);
	}
	
	@FXML
	public void initialize() {
		Image m = new Image("ui/assets/default_picture.png");
		imageCircle.setFill(new ImagePattern(m));
	}
}