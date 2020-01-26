
public abstract class PieStore {
	
	protected abstract Pie createPie(String item);
	
	public Pie orderPie(String type) {
		Pie pie = createPie(type);
		System.out.println("--- Making " + pie.getName() + "---");
		pie.prepare();
		pie.bake();
		pie.box();
		return pie;
	}
	
	
}
