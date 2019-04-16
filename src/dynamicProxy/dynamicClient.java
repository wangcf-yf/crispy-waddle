package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import staticProxy.Car;
import staticProxy.Moverable;

public class DynamicClient {

	public static void main(String[] args) {
//		Moverable m=new Car();
//		MyTimeInvoke invoke=new MyTimeInvoke(m);
//		Moverable moverable=(Moverable)invoke.getObject();
//		moverable.move();
		
		Moverable car =new Car();
		/**
		 * loader 类加载器 在当前线程中
		 * intefaces 实现接口
		 * h invocationHandler
		 * */
//		ClassLoader loader=Thread.currentThread().getContextClassLoader();
//		Class<?>[] interfaces=car.getClass().getInterfaces();
		ClassLoader loader=car.getClass().getClassLoader();
		Class<?>[] interfaces=car.getClass().getInterfaces();
		InvocationHandler h=new MyTimeInvoke(car);
		/**
		 * 获取到当前的代理对象
		 * */
		Moverable m= (Moverable)Proxy.newProxyInstance(loader, interfaces, h);
		m.move();
	}
}
