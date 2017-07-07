package faiz;

public class Potatoes extends RetailItem {
	
	int weight;
	int PricePerPound = 1;
	int cost;
	
	public Potatoes(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void setMethod(int weight) {
		this.weight = weight;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		cost = weight * PricePerPound;
		return cost;
	}

}
