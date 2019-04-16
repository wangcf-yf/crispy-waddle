package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyLogInvoke implements InvocationHandler {
	
	private Object target;
	
	public MyLogInvoke(Object target) {
		// TODO Auto-generated constructor stub
		this.target=target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始记录日志。。。");
		method.invoke(target);
		System.out.println("结束记录日志。。。");
		return null;
	}
	
	/**
	 * 生成代理对象
	 * */
	public Object getObject() {
		ClassLoader loader=Thread.currentThread().getContextClassLoader();
	 	Class<?>[] interfaces= target.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}

}
