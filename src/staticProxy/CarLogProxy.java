package staticProxy;

public class CarLogProxy implements Moverable {
	private Moverable m;
	
	public CarLogProxy(Moverable m) {
		// TODO Auto-generated constructor stub
		this.m=m;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("开始记录日志。。。");
		m.move();
		System.out.println("结束记录日志。。。");
	}

}
