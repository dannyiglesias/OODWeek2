
public class ErnPieStore extends PieStore {
	
	protected Pie createPie(String item) {
		Pie pie = null;
		PieIngredientFactory ingredientFactory = 
			new ErnPieIngredientFactory();
 
		if (item.equals("Pecan")) {
  
			pie = new PecanPie(ingredientFactory);
			pie.setName("Dans Famous Pecan Pie");
  
		} else if (item.equals("Apple")) {
 
			pie = new ApplePie(ingredientFactory);
			pie.setName("Dans Famous Apple Pie");
 
		} else if (item.equals("Cherry")) {
			
			pie = new CherryPie(ingredientFactory);
			pie.setName("Dans Famous Cherry Pie");
		}
		return pie;
	}

}
