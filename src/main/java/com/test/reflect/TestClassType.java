package com.test.reflect;

/**
 * @Author: lds
 * @Date: 2019/6/27 16:55
 */
public class TestClassType {
	public static String str;
	public static int i ;
	
	// 构造函数
	public TestClassType () {
		
		System.out.println ("----构造函数---");
	}
	
	// 静态的参数初始化
	static {
		str = "静态的参数初始化";
		System.out.println (str);
	}
	
	// 非静态的参数初始化
	{
		i = 432;
		System.out.println (i);
	}
}
