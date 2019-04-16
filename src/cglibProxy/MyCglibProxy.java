package cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer=new Enhancer();
	
	public Object getProxy(Class<?> clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	/**
	 * 拦截所有目标类的调用
	 * obj 目标类的实例
	 * method 目标类的方法
	 * args 目标类的参数
	 * proxy 代理类的实例
	 * */
	@Override
	public Object intercept(Object o, Method m, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始记录日志。。。。");
		proxy.invokeSuper(o, args);
		System.out.println("结束记录日志。。。。");
		return null;
	}
	
}
