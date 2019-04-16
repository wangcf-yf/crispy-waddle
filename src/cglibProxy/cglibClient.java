package cglibProxy;

public class cglibClient {
	public static void main(String[] args) {
		MyCglibProxy cglibProxy=new MyCglibProxy();
		Train t=(Train)cglibProxy.getProxy(Train.class);
		t.run();
	}
}
