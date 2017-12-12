package pkgApp.controller;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	@FXML
	private TextField txtAnnualReturnWork;
	@FXML
	private TextField txtYearsRetired;
	@FXML
	private TextField txtAnnualReturnRetired;
	@FXML
	private TextField txtRequiredIncome;
	@FXML
	private TextField txtMonthlySSI;
	@FXML
	private TextField txtSaveEachMonth;
	@FXML
	private TextField txtNeedToSave;

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
		txtYearsToWork.clear();
		txtAnnualReturnWork.clear();
		txtYearsRetired.clear();
		txtAnnualReturnRetired.clear();
		txtRequiredIncome.clear();
		txtMonthlySSI.clear();		
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		Retirement r = new Retirement(Integer.parseInt(txtYearsToWork.getText()),Double.parseDouble(txtAnnualReturnWork.getText()),
				Integer.parseInt(txtYearsRetired.getText()),Double.parseDouble(txtAnnualReturnRetired.getText()),
				Double.parseDouble(txtRequiredIncome.getText()),Double.parseDouble(txtMonthlySSI.getText()));	
		txtSaveEachMonth.setText(NumberFormat.getCurrencyInstance().format(r.AmountToSave()));
		txtNeedToSave.setText(NumberFormat.getCurrencyInstance().format(r.TotalAmountSaved()));
		
	}
	
}
