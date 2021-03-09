package com.test.oops;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			TestA a=new TestA();
			a.one();
			a.tw0();
			a.three();
			
			System.out.println("******");
			
			TestB b=new TestB();
			TestB b1=new TestB();
			TestB dd=new TestB();
			TestB bbb=new TestB();
			b.A();
			b.B();
			b.c();
			b.one();
			b.three();
			
			System.out.println("******");
			
			TestC c=new TestC();
			c.x();
			c.y();
			c.B();
			c.c();
			c.one();
			
			System.out.println("******");
			
			TestA aa=new TestC();
			
			aa.one();
			
			
			
	}

}
