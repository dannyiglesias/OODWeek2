public class pieOrder {
 
	public static void main(String[] args) {
		PieStore dStore = new DanPieStore();
		PieStore eStore = new ErnPieStore();
 
		Pie Pie = dStore.orderPie("Blueberry");
		System.out.println("Brian ordered " + Pie + "\n");
 
		Pie = eStore.orderPie("Apple");
		System.out.println("Jeff ordered " + Pie + "\n");

		Pie = dStore.orderPie("Lemon");
		System.out.println("Kevin ordered " + Pie + "\n");
 
		Pie = eStore.orderPie("Pecan");
		System.out.println("Chris ordered " + Pie + "\n");

		Pie = eStore.orderPie("Cherry");
		System.out.println("Glen ordered " + Pie + "\n");
	}
}