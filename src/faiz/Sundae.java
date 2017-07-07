package faiz;

public class Sundae extends IceCream{

	int topping;
	int cost;
	public Sundae(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void setMethod(int topping) {
		this.topping=topping;
	}
	
	public int getCost() {
		System.out.print("the sundae cost is the icecream cost: $"+super.cost+" plus topping cost: $"+this.topping+" which is equals to: $");
		cost = topping + super.cost;
		return cost;
	}

}
