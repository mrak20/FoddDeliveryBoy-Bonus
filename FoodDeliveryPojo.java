package basic;

public class FoodDeliveryPojo {
	
	String name;
	int expected;
	int actual;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpected() {
		return expected;
	}
	public void setExpected(int expected) {
		this.expected = expected;
	}
	public int getActual() {
		return actual;
	}
	public void setActual(int actual) {
		this.actual = actual;
	}
	public FoodDeliveryPojo(String name, int expected, int actual) {
		super();
		this.name = name;
		this.expected = expected;
		this.actual = actual;
	}
	public FoodDeliveryPojo() {
		super();
	}
	@Override
	public String toString() {
		return "FoodDeliveryPojo [name=" + name + ", expected=" + expected + ", actual=" + actual + "]";
	}
	
	
}
