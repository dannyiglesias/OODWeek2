
public class DanPieStore extends PieStore {
	
	protected Pie createPie(String item) {
		Pie pie = null;
		PieIngredientFactory ingredientFactory = 
			new DanPieIngredientFactory();
 
		if (item.equals("Blueberry")) {
  
			pie = new BlueberryPie(ingredientFactory);
			pie.setName("Dans Famous Blueberry Pie");
  
		} else if (item.equals("Lemon")) {
 
			pie = new LemonCurdPie(ingredientFactory);
			pie.setName("Dans Famous Lemon Curd Pie");
 
		} 
		return pie;
	}

}
