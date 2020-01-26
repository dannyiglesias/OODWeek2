
public class CherryPie extends Pie {
	PieIngredientFactory ingredientFactory;
	
	public CherryPie(PieIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		filling = ingredientFactory.createFilling();
		nuts = ingredientFactory.createNuts();
		fruit = ingredientFactory.createFruit();
	}

}
