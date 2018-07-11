package com.java.impl;

import com.java.abstracts.DemoAbstract;
import com.java.interfaces.DemoInterface;

public class ChildClass extends DemoAbstract implements DemoInterface{
	public void testMethod(){System.out.println("testMethod - ChildClass");}

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		System.out.println("childClass - interfaceMethod");
		System.out.println("Val of variable from interface: " + DemoInterface.val );
	};

}
