
public class StringToInt {

	public static void main(String[] args) {
	
	String s = "age: 47";
	s=s.replaceAll("\\D+", "");
			
	int n = Integer.parseInt(s);
	System.out.println(n + 2);
	
	int a = 5;
	System.out.println(Integer.toString(a) + 5);
	
	String b = "105";
	System.out.println(Integer.parseInt(b) + 2);
		
	}

}
