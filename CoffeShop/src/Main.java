
public class Main {

	public static void main(String[] args) {
		
		
		Beer b = new Beer("Skopsko", "ZLaten Dab", "Tubork", "Gorsko");
		b.welcome();
		
		System.out.println(" ");
		
		b.setPrices(120, 110, 130, 100);
		b.showPrices();
		
		
		System.out.println(" ");
		
		Coffe c = new Coffe("Machiatto", "Espresso", "Nescaffe", "Mocha");
		c.setPrices(70, 50, 100, 80);
		c.showPrices();
		
		

	}

}
