
public class Coffe implements MenuInterface {
	
	private String item1;
	private String item2;
	private String item3;
	private String item4;
	
	private int item1price;
	private int item2price;
	private int item3price;
	private int item4price;
	
	
	
	public Coffe(String item1, String item2, String item3, String item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;

	}
	
	public String getMenu() {
		
	return this.item1 + " " + this.item2 + " " + this.item3 + " " + this.item4;
	}
	
	@Override
	public void showMenu() {
		System.out.println(getMenu());
		
	}

	@Override
	public void setPrices(int item1price, int item2price, int item3price, int item4price) {
		
		this.item1price = item1price;
		this.item2price = item2price;
		this.item3price = item3price;
		this.item4price = item4price;
		
	}

	@Override
	public void showPrices() {
		System.out.println("The price of "+ this.item1 + " is: " + this.item1price);
		System.out.println("The price of "+ this.item2 + " is: " + this.item2price);
		System.out.println("The price of "+ this.item3 + " is: " + this.item3price);
		System.out.println("The price of "+ this.item4 + " is: " + this.item4price);
		System.out.println("Nice coffee!!!");
	}

}
