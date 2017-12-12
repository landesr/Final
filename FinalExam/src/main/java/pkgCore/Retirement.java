package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired,
			double dRequiredIncome, double dMonthlySSI) {
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}
	public int getiYearsToWork() {
		return iYearsToWork;
	}
	public void setiYearsToWork(int iYearsToWork) {
		this.iYearsToWork = iYearsToWork;
	}
	public double getdAnnualReturnWorking() {
		return dAnnualReturnWorking;
	}
	public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}
	public int getiYearsRetired() {
		return iYearsRetired;
	}
	public void setiYearsRetired(int iYearsRetired) {
		this.iYearsRetired = iYearsRetired;
	}
	public double getdAnnualReturnRetired() {
		return dAnnualReturnRetired;
	}
	public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}
	public double getdRequiredIncome() {
		return dRequiredIncome;
	}
	public void setdRequiredIncome(double dRequiredIncome) {
		this.dRequiredIncome = dRequiredIncome;
	}
	public double getdMonthlySSI() {
		return dMonthlySSI;
	}
	public void setdMonthlySSI(double dMonthlySSI) {
		this.dMonthlySSI = dMonthlySSI;
	}
	public double AmountToSave() {
		return this.TotalAmountSaved()*(dAnnualReturnWorking/1200)/(Math.pow((1+(dAnnualReturnWorking/1200)),12*iYearsToWork)-1);
	}
	
	public double TotalAmountSaved()
	{
		return  (dRequiredIncome-dMonthlySSI)*(1-Math.pow(1+(dAnnualReturnRetired/1200),-iYearsRetired*12))/(dAnnualReturnRetired/1200);
	}
}
