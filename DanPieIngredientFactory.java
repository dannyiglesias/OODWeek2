public class DanPieIngredientFactory implements PieIngredientFactory {
 
	public Dough createDough() {
		return new FlakyDough();
	}
 
	public Filling createFilling() {
		return new LightFilling();
	}
 
	public Nuts[] createNuts() {
		Nuts nuts[] = { new Almond(), new Walnut() };
		return nuts;
	}
 
	public Fruit[] createFruit() {
		Fruit fruit[] = { new Blueberry(), new Lemon() };
		return fruit;
	}

}