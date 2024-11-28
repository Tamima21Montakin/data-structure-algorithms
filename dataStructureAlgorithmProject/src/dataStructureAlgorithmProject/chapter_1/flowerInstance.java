package dataStructureAlgorithmProject.chapter_1;

/*R-1.10 Write a Java class, Flower, that has three instance variables of type String, int,
and float, which respectively represent the name of the flower, its number of
petals, and price. Your class must include a constructor method that initializes
each variable to an appropriate value, and your class should include methods for
setting the value of each type, and getting the value of each type.*/

public class flowerInstance {

	private String flowerName;
	private int petal;
	private float price;

	public flowerInstance(String name, int petals, float price) {
		// TODO Auto-generated constructor stub
		this.flowerName = name;
		this.petal = petals;
		this.price = price;

	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public int getPetal() {
		return petal;
	}

	public void setPetal(int petal) {
		this.petal = petal;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flowerInstance flower = new flowerInstance("rose", 20, 12.5f);
		System.out
				.println(flower.getFlowerName() + " with " + flower.petal + " petals and the price is " + flower.price);
	}

}
