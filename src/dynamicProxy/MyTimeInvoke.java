package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyTimeInvoke implements InvocationHandler {
	
	private Object target;
	
	public MyTimeInvoke(Object target) {
		// TODO Auto-generated constructor stub
		this.target=target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("汽车开始行驶。。。");
		long starttime=System.currentTimeMillis();
		method.invoke(target);
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶，行驶了"+(endtime-starttime)+"毫秒");
		return null;
	}
	
//	public Object getObject() {
//		ClassLoader loader=Thread.currentThread().getContextClassLoader();
//	 	Class<?>[] interfaces= target.getClass().getInterfaces();
//		return Proxy.newProxyInstance(loader, interfaces, this);
//	}

}
