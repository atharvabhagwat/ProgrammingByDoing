
public class retail_shop {

	public static void main(String[] args) {
		int itema=200, itemb=75, itemc=500; 
		double price;
		
		price=((itema*2)+(itemb)+(itemc*3));
		price=price-(0.1*price);
		price=price+(0.05*price);
		
		System.out.println("The total price is $"+price);
		
		if(price > 1500)
		{
			System.out.println("Congrats you have a 25% discount coupon");
		}
		else
		{
			System.out.println("Thank you for shopping with us!");
		}
	}

}
