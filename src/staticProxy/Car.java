package staticProxy;

import java.util.Random;

public class Car implements Moverable {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中。。。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
