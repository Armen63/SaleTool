
public class Main {
	public static void main(String [] args){
		SaleData data = new SaleData();
		
		dispLayGreeting();
		data.display();
	}
	private static void dispLayGreeting(){
		System.out.println("Hello happy sales people!");
		System.out.println("This app shows sales data");
	}
}
