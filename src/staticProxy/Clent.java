package staticProxy;

public class Clent {
	public static void main(String[] args) {
		Car car=new Car();
		Moverable m=new CarTimeProxy(car);
		Moverable n=new CarLogProxy(m);
		n.move();
	}
}
