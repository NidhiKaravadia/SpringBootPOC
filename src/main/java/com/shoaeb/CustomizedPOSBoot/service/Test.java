package com.shoaeb.CustomizedPOSBoot.service;

public class Test {

	public void getInfo(int i)
	{
		System.out.println("int" +i);
	}
	public void getInfo(long j)
	{
		System.out.println("long"+ j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		test.getInfo(10l);
		test.getInfo(20);
	}

}
