
public class PieIngredients {
	
	public Dough[] createDough() {
		Dough dough[] = { new FlakyDough(), new FirmDough() };
		return dough;
	}
 
	public Filling[] createFilling() {
		Filling filling[] = { new HeavyFilling(), new LightFilling() };
		return filling;
	}
 
	public Nuts[] createNuts() {
		Nuts nuts[] = { new Almond(), new Walnut(), new Pecan(), new Macademia() };
		return nuts;
	}
 
	public Fruit[] createFruit() {
		Fruit fruit[] = { new Blueberry(), new Lemon(), new Apple(), new Cherry() };
		return fruit;
	}


}
