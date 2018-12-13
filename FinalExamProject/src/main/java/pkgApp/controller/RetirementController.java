package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private Label lblWhatToSaveTotal;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtAnnualReturnW;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtAnnualReturnR;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private Label lblErrorValue;
	
	@FXML
	private Label lblErrorValue2;

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
		
		lblSaveEachMonth.setText("");
		lblWhatToSaveTotal.setText("");
		txtYearsToWork.setText("");
		txtAnnualReturnW.setText("");
		txtYearsRetired.setText("");
		txtAnnualReturnR.setText("");
		txtRequiredIncome.setText("");
		txtMonthlySSI.setText("");
		
		System.out.println("Clear pressed");
		
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) throws Exception {
		
		try {
			int iYTW = Integer.parseInt(txtYearsToWork.getText());
			int iYR = Integer.parseInt(txtYearsRetired.getText());
			double dARW = Double.parseDouble(txtAnnualReturnW.getText());
			double dARR = Double.parseDouble(txtAnnualReturnR.getText());
			double dRI = Double.parseDouble(txtRequiredIncome.getText());
			double dMSSI = Double.parseDouble(txtMonthlySSI.getText());
		
			Retirement R= new Retirement(iYTW,dARW,iYR,dARR,dRI,dMSSI);
		
			lblSaveEachMonth.setText(Double.toString(R.AmountToSave()));
			lblWhatToSaveTotal.setText(Double.toString(R.TotalAmountSaved()));
		}
		catch(Exception NumberformatException) {
			lblErrorValue.setText("Years must be whole numbers");
			lblErrorValue2.setText("Fields must be numerical values");
			throw  NumberformatException;
			
		}
		

		
	}
	
}
