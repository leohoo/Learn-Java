package decorator;

//abstract decorator class - note that it implements Coffee interface
abstract public class CoffeeDecorator implements Coffee {
	protected final Coffee decoratedCoffee;
	protected String ingredientSeparator = ", ";

	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}

	public double getCost() { // implementing methods of the interface
		return decoratedCoffee.getCost();
	}

	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
}

