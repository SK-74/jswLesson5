package sample;

public class MyHome extends House {

	/**
	 * ローン年間返済額
	 */
	private int annualRepayment;
	
	/**
	 * 固定資産税
	 */
	private int propertyTax;

	/**
	 * @return annualRepayment
	 */
	public int getAnnualRepayment() {
		return annualRepayment;
	}

	/**
	 * @param annualRepayment セットする annualRepayment
	 */
	public void setAnnualRepayment(int annualRepayment) {
		this.annualRepayment = annualRepayment;
	}

	/**
	 * @return propertyTax
	 */
	public int getPropertyTax() {
		return propertyTax;
	}

	/**
	 * @param propertyTax セットする propertyTax
	 */
	public void setPropertyTax(int propertyTax) {
		this.propertyTax = propertyTax;
	}

	/**
	 * 費用の計算を行う
	 */
	@Override
	public void calculateAnnualCost() {
		//ローン年間返済額と固定資産税、水道光熱費12か月分を居住費とする
		int[] items = {this.getAnnualRepayment(), this.getPropertyTax(), this.getUtilities() * 12};
		this.setCost(items);
	}
}
