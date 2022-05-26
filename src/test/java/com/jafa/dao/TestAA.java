package com.jafa.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAA {
	
	@Before
	public void setUp() {
		System.out.println("==========================================");
	}
	@After
	public void tear() {
		System.out.println("******************************************");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}

}
