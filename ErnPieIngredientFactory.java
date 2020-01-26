public class ErnPieIngredientFactory implements PieIngredientFactory {
 
	public Dough createDough() {
		return new FirmDough();
	}
 
	public Filling createFilling() {
		return new HeavyFilling();
	}
 
	public Nuts[] createNuts() {
		Nuts nuts[] = { new Pecan(), new Macademia() };
		return nuts;
	}
 
	public Fruit[] createFruit() {
		Fruit fruit[] = { new Apple(), new Cherry() };
		return fruit;
	}

}