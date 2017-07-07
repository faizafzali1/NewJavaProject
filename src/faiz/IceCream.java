package faiz;

public class IceCream extends RetailItem{

	int number;
	int pricepernumber = 1;
	int cost;
	public IceCream(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void setMethod(int number) {
		this.number=number;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		cost =number*pricepernumber;
		return cost;
	}

}
