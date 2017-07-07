package faiz;

public class Eggs extends RetailItem {
	
	int number;
	int dozen = 12;
	int PricePerDozen = 3;
	

	public Eggs(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void setMethod(int number) {
		this.number = number;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int cost = number / dozen * PricePerDozen;
		return cost;
	}

}
