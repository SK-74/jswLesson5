package sample;

public class Apartment extends House {

	/**
	 * 家賃(月々)
	 */
	private int rent;

	/**
	 * @return rent
	 */
	public int getRent() {
		return rent;
	}

	/**
	 * @param rent セットする rent
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}

	/**
	 * 費用の計算を行う
	 */
	@Override
	public void calculateAnnualCost() {
		//家賃12か月分と水道光熱費12か月分を居住費とする
		int[] items = {this.getRent() * 12, this.getUtilities() * 12};
		this.setCost(items);
	}
}
