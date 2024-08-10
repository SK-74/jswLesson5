package sample;

public class House {

	/**
	 * 住人
	 */
	private String name;

	/**
	 * 費用
	 */
	private int cost;
	
	/**
	 * 水道光熱費
	 */
	private int utilities;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost セットする cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return utilities
	 */
	public int getUtilities() {
		return utilities;
	}

	/**
	 * @param utilities セットする utilities
	 */
	public void setUtilities(int utilities) {
		this.utilities = utilities;
	}

	/**
	 * @param items　セットする costの配列
	 */
	protected void setCost(int[] items) {
		int workCost = 0;
		for(int i = 0; i < items.length; i++) {
			workCost += items[i];
		}
		this.setCost(workCost);
	}

	/**
	 * 費用の計算を行う
	 */
	public void calculateAnnualCost() {
		//派生クラスでオーバーライドすること
	}
}
