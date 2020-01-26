public abstract class Pie {
	String name;

	Dough dough;
	Filling filling;
	Nuts[] nuts;
	Fruit[] fruit;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 45 minutes at 350");
	}

	void box() {
		System.out.println("Place pie in official PieStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (filling != null) {
			result.append(filling);
			result.append("\n");
		}
		if (fruit != null) {
			result.append(fruit);
			result.append("\n");
		}
		if (nuts != null) {
			result.append(nuts);
			result.append("\n");
//			for (int i = 0; i < nuts.length; i++) {
//				result.append(nuts[i]);
//				if (i < nuts.length-1) {
//					result.append(", ");
//				}
//			}
//			result.append("\n");
		}
		
		return result.toString();
	}
}