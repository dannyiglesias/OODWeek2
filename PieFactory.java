
public class PieFactory {
	
	public Pie createPie(String type) {
		Pie pie = null;
		
		if(type.equals("Pecan")) {
			pie = new PecanPie();
		} else if (type.equals("Apple")) {
			pie = new ApplePie();
		} else if (type.equals("Blueberry")) {
			pie = new BlueberryPie();
		} else if (type.equals("Lemon")) {
			pie = new LemonCurdPie();
		}
		return pie;
	}

}
