package UPI;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		UPI u = new UPI();
//		u.pay();
//		u.bill();
//		u.offer();
//		
//		
//		System.out.println("==============");
//		
//		Wallet w = new Wallet();
//		w.pay();
//		w.bill();
//		w.offer();
//		
//		System.out.println("==============");
//		Card crt = new Card();
//		crt.pay();
//		crt.bill();
//		crt.offer();
		
		
//		using Upcasting 
		
		Payment ref;
		
		UPI u = new UPI();
		ref = u;
		ref.bill();
		ref.offer();
		ref.pay();
		
		
		Wallet w = new Wallet();
		ref = w;
		ref.bill();
		ref.offer();
		ref.pay();
		
		
		Card c = new Card();
		ref = c;
		ref.bill();
		ref.offer();
		ref.pay();
		
		
		
		

	}

}
