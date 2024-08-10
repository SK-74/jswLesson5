package sample;

public class Test {
	
	public static void main(String[] args) {
		MyHome suzukiHome = new MyHome();
		//住人
		suzukiHome.setName("鈴木さん");
		//ローンの年間返済額
		suzukiHome.setAnnualRepayment(1000000);
		//固定資産税
		suzukiHome.setPropertyTax(30000);
		//水道光熱費
		suzukiHome.setUtilities(10000);
		//年間費用の計算
		suzukiHome.calculateAnnualCost();
		System.out.print(suzukiHome.getName() + ":" 
				+ suzukiHome.getCost() + "\n");

		Apartment watanabeAprt = new Apartment();
		//住人
		watanabeAprt.setName("渡辺さん");
		//月々の家賃
		watanabeAprt.setRent(50000);
		//水道光熱費
		watanabeAprt.setUtilities(8000);
		//年間費用の計算
		watanabeAprt.calculateAnnualCost();
		System.out.print(watanabeAprt.getName() + ":" 
				+ watanabeAprt.getCost() + "\n");		
	}
}
