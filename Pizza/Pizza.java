public class Pizza
{
	private double cost;
	private String crust;
	private int size;
	private int numToppings;
	private String toppingList;

	public Pizza()
	{
		cost = 12.99;
		crust = "Hand-tossed";
		size = 12;
		numToppings = 0;
		toppingList = null;
	}

	public void setCost (double amount)
	{
		cost += amount;
	}

	public void setCrust (String type)
	{
		crust = type;
	}

	public void setSize (int diameter)
	{
		size = diameter;
	}

	public void setNumToppings(int number)
	{
		numToppings = number;
	}

	public void setToppingList (String newTopping)
	{
		toppingList = newTopping;
	}

	public double getCost()
	{
		return cost;
	}

	public String getCrust()
	{
		return crust;
	}

	public int getSize()
	{
		return size;
	}

	public int getNumToppings()
	{
		return numToppings;
	}

	public String getToppingList()
	{
		return toppingList;
	}
}
