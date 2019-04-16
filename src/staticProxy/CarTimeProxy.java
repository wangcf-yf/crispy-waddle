package staticProxy;

public class CarTimeProxy implements Moverable {
	private Moverable m;

	public CarTimeProxy (Moverable m) {
		this.m=m;
	}
	
	@Override
	public void move() {
		System.out.println("汽车开始行驶。。。");
		long starttime=System.currentTimeMillis();
		m.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶了"+(endtime-starttime)+"毫秒");
	}
	
	
}
