public class pieOrder {
 
	public static void main(String[] args) {
		PieStore dStore = new DanPieStore();
		PieStore eStore = new ErnPieStore();
 
		Pie pie = dStore.orderPie("Blueberry");
		System.out.println("Brian ordered " + pie + "\n");
 
		pie = eStore.orderPie("Apple");
		System.out.println("Jeff ordered " + pie + "\n");

		pie = dStore.orderPie("Lemon");
		System.out.println("Kevin ordered " + pie + "\n");
 
		pie = eStore.orderPie("Pecan");
		System.out.println("Chris ordered " + pie + "\n");

		pie = eStore.orderPie("Cherry");
		System.out.println("Glen ordered " + pie + "\n");
	}
}
