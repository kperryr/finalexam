package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
